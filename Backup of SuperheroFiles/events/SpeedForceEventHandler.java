package com.zseltzer.zevadditions.events;

//import com.tihyo.legends.handlers.KeyHandler;
//import com.tihyo.superheroes.armors.AbstractFlash;
//import com.tihyo.superheroes.armors.ArmorFlashCW;
//import com.tihyo.superheroes.common.SUMGameRules;
//import com.tihyo.superheroes.common.Main;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
/*
public class SpeedForceEventHandler
{
    private float speed = 0.02f;

    @SubscribeEvent
    public void onEntityUpdate(LivingEvent.LivingUpdateEvent event) {
        if (!event.entityLiving.func_70644_a(Main.speedForcePotion)) return;
        if (!(event.entity instanceof EntityPlayer)) return;
        EntityPlayer player = (EntityPlayer)event.entity;
        player.func_70690_d(new PotionEffect(Main.strengthPotion.field_76415_H, 10, 7));
        if (event.entityLiving.func_110143_aJ() < event.entityLiving.func_110138_aP()) {
            event.entityLiving.func_70691_i((float)((double)event.entityLiving.func_70660_b(Main.strengthPotion).func_76458_c() * 0.1));
        }
        if (player.func_82169_q(3) == null) return;
        if (player.func_82169_q(2) == null) return;
        if (player.func_82169_q(1) == null) return;
        if (player.func_82169_q(0) == null) return;
        if (!(player.func_82169_q(3).func_77973_b() instanceof AbstractFlash)) return;
        if (!(player.func_82169_q(2).func_77973_b() instanceof AbstractFlash)) return;
        if (!(player.func_82169_q(1).func_77973_b() instanceof AbstractFlash)) return;
        if (!(player.func_82169_q(0).func_77973_b() instanceof AbstractFlash)) return;
        if (player.field_70170_p.field_72995_K) {
            player.field_70138_W = player.field_70123_F && player.field_70122_E ? 1.5f : 0.5f;
            if (player.field_70701_bs >= 0.01f) {
                float f = player.field_70177_z * 0.017453292f;
                player.field_70159_w-=(double)(MathHelper.func_76126_a((float)f) * this.speed);
                player.field_70179_y+=(double)(MathHelper.func_76134_b((float)f) * this.speed);
                if (KeyHandler.F_KEY.func_151470_d() && !net.minecraft.client.Minecraft.func_71410_x().field_71456_v.func_146158_b().func_146241_e() && net.minecraft.client.Minecraft.func_71410_x().field_71462_r == null) {
                    if (player.func_82169_q(3).func_77973_b() instanceof ArmorFlashCW && player.func_82169_q(2).func_77973_b() instanceof ArmorFlashCW && player.func_82169_q(1).func_77973_b() instanceof ArmorFlashCW && player.func_82169_q(0).func_77973_b() instanceof ArmorFlashCW) {
                        if (this.speed <= 1.8f) {
                            this.speed+=0.01f;
                        }
                    } else if (!(this.speed > 2.1f || SUMGameRules.isSpeedLimit)) {
                        this.speed+=0.01f;
                    } else if (SUMGameRules.isSpeedLimit && this.speed <= 0.5f) {
                        this.speed+=0.01f;
                    }
                    if (this.speed >= 0.2f && !KeyHandler.V_KEY.func_151470_d() && player.field_70123_F) {
                        player.field_70181_x+=0.1;
                    }
                } else if (KeyHandler.R_KEY.func_151470_d()) {
                    this.speed = 0.02f;
                }
                if (KeyHandler.C_KEY.func_151470_d()) {
                    if ((double)this.speed >= 0.02) {
                        this.speed-=0.01f;
                    }
                } else if (KeyHandler.R_KEY.func_151470_d()) {
                    this.speed = 0.02f;
                }
                if ((double)this.speed >= 0.5 && player.func_70027_ad()) {
                    player.func_70066_B();
                }
                if ((double)this.speed >= 1.5) {
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u + 0.2, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u + 0.1, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u + 0.09, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u + 0.08, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u + 0.07, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u + 0.06, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u + 0.05, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u + 0.04, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u + 0.03, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u + 0.02, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u + 0.01, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.1, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.11, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.12, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.13, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.14, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.15, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.16, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.17, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.18, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.19, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.2, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.21, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.22, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.23, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.24, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.25, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.26, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.27, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.28, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.29, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.3, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.3, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.32, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.33, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.34, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.35, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.36, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.37, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.38, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.39, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.4, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.4, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.42, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.43, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.44, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.45, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.46, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.47, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.48, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.49, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.5, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.51, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.52, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.53, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.54, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.55, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.56, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.57, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.58, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.59, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.6, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.61, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.62, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.63, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.64, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.65, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.66, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.67, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.68, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.69, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.7, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.71, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.72, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.73, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.74, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.75, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.76, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.77, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.78, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.79, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.8, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.81, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.82, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.83, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.84, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.85, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.86, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.87, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.88, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.89, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.9, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.91, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.92, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.93, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.94, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.95, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.96, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.97, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.98, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 0.99, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 1.0, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 1.1, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 1.2, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 1.3, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 1.4, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 1.5, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 1.6, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 1.7, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 1.8, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 1.9, player.field_70161_v, 0.0, 0.0, 0.0);
                    player.field_70170_p.func_72869_a("reddust", player.field_70165_t, player.field_70163_u - 2.0, player.field_70161_v, 0.0, 0.0, 0.0);
                }
            }
        }
        if (!player.func_70644_a(Main.intangPotion)) return;
        if (!player.field_70122_E) return;
        player.field_70181_x = 0.0;
    }

    @SubscribeEvent
    public void onLivingAttackEvent(LivingAttackEvent event) {
        if (!(event.entity instanceof EntityPlayer)) return;
        EntityPlayer player = (EntityPlayer)event.entity;
        if (player.func_82169_q(3) == null) return;
        if (player.func_82169_q(2) == null) return;
        if (player.func_82169_q(1) == null) return;
        if (player.func_82169_q(0) == null) return;
        if (!(player.func_82169_q(3).func_77973_b() instanceof AbstractFlash)) return;
        if (!(player.func_82169_q(2).func_77973_b() instanceof AbstractFlash)) return;
        if (!(player.func_82169_q(1).func_77973_b() instanceof AbstractFlash)) return;
        if (!(player.func_82169_q(0).func_77973_b() instanceof AbstractFlash)) return;
        if (player.func_70027_ad()) return;
        if (!player.func_70644_a(Main.intangPotion)) return;
        event.setCanceled(true);
    }

    @SubscribeEvent
    public void onAttackEntityEvent(AttackEntityEvent event) {
        if (!(event.entity instanceof EntityPlayer)) return;
        EntityPlayer player = (EntityPlayer)event.entity;
        if (player.func_82169_q(3) == null) return;
        if (player.func_82169_q(2) == null) return;
        if (player.func_82169_q(1) == null) return;
        if (player.func_82169_q(0) == null) return;
        if (!(player.func_82169_q(3).func_77973_b() instanceof AbstractFlash)) return;
        if (!(player.func_82169_q(2).func_77973_b() instanceof AbstractFlash)) return;
        if (!(player.func_82169_q(1).func_77973_b() instanceof AbstractFlash)) return;
        if (!(player.func_82169_q(0).func_77973_b() instanceof AbstractFlash)) return;
        if (player.func_70027_ad()) return;
        if (!player.func_70644_a(Main.intangPotion)) return;
        event.setCanceled(true);
    }
}
*/