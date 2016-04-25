 package com.zseltzer.zevadditions.events;

 //import com.tihyo.superheroes.common.SUMGameRules;
 import com.zseltzer.zevadditions.Main;
 import cpw.mods.fml.common.eventhandler.SubscribeEvent;
 import net.minecraft.block.material.Material;
 import net.minecraft.entity.EntityLivingBase;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.entity.player.PlayerCapabilities;
 import net.minecraft.potion.Potion;
 import net.minecraft.potion.PotionEffect;
 import net.minecraft.util.DamageSource;
 import net.minecraft.world.World;
 import net.minecraftforge.event.entity.living.LivingAttackEvent;
 import net.minecraftforge.event.entity.living.LivingEvent;
 import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
 import org.lwjgl.input.Keyboard;
/*
 public class PotionEventHooks
 {
       private float speed = 0.02F;


   @SubscribeEvent
   public void onEntityUpdate(LivingEvent.LivingUpdateEvent event)
   {
   if ((event.entityLiving.func_70644_a(Main.jumpPotion)) && (!event.entityLiving.func_70090_H()))
     {
       if ((((EntityPlayer)event.entityLiving).field_70170_p.field_72995_K) && (Keyboard.isKeyDown(57)) && (!((EntityPlayer)event.entityLiving).field_71075_bZ.field_75100_b))
       {
         event.entityLiving.field_70181_x += 0.016999999105930325D + (event.entityLiving.func_70660_b(Main.jumpPotion).func_76458_c() + 1) * 0.01F;
       }
     }


     if (event.entityLiving.func_70644_a(Main.lowGravityPotion))
     {
       event.entityLiving.func_70606_j(event.entityLiving.func_110143_aJ() - 0.5F);
     }


     if ((event.entityLiving.func_70089_S()) && (event.entityLiving.func_70055_a(Material.field_151586_h)))
     {
       if (event.entityLiving.func_82165_m(Main.waterPotion.field_76415_H))
       {
         event.entityLiving.func_70050_g(300);
       }
     }


     if (event.entityLiving.func_70644_a(Main.firePotion))
     {

       event.entityLiving.func_70066_B();
     }


     if (event.entityLiving.func_70644_a(Main.regenPotion))
     {
     if (event.entityLiving.func_110143_aJ() < event.entityLiving.func_110138_aP())
       {
        event.entityLiving.func_70691_i((float)(event.entityLiving.func_70660_b(Main.regenPotion).func_76458_c() * 0.4D));
       }
     }


     if (((event.entity instanceof EntityPlayer)) // && (SUMGameRules.intangibility == true))
     {
       EntityPlayer player = (EntityPlayer)event.entity;
       if ((player.func_70644_a(Main.intangPotion)) && (!player.func_70027_ad()))
       {
         player.field_70145_X = true;
       }

       int x = (int)Math.floor(player.field_70165_t);
       int y = (int)(player.field_70163_u - player.func_70033_W());
       int z = (int)Math.floor(player.field_70161_v);

       if (player.func_70660_b(Main.intangPotion) == null)
       {
         player.field_70145_X = false;
       }
     }
   }


   @SubscribeEvent
   public void onBurnDamage(LivingAttackEvent event)
   {
     if ((event.entity instanceof EntityPlayer))
     {
       EntityPlayer player = (EntityPlayer)event.entity;
       if ((event.source.equals(DamageSource.field_76371_c)) || (event.source.equals(DamageSource.field_76372_a)) || (event.source.equals(DamageSource.field_76370_b)))
       {
         if (player.func_82165_m(Main.firePotion.field_76415_H))
         {
           event.setCanceled(true);
         }
       }
     }
   }
 }
 */