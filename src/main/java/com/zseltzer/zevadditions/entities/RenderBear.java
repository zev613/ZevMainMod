package com.zseltzer.zevadditions.entities;

import com.zseltzer.zevadditions.Reference;
import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderBear extends RenderLiving
{
    public RenderBear(ModelBase par1ModelBase, float par2) 
    {
		super(par1ModelBase, par2);
		setEntityTexture();
	}

	private void setEntityTexture() 
	{
		// TODO Auto-generated method stub
		bearTextures =  new ResourceLocation(Reference.MODID + ":zevadditions/textures/entity/bear.png");
	}

	private static ResourceLocation bearTextures = new ResourceLocation(Reference.MODID + ":textures/entity/bear.png");
        //private static final ResourceLocation tamedWolfTextures = new ResourceLocation("textures/entity/wolf/wolf_tame.png");
        //private static final ResourceLocation anrgyWolfTextures = new ResourceLocation("textures/entity/wolf/wolf_angry.png");
        //private static final ResourceLocation wolfCollarTextures = new ResourceLocation("textures/entity/wolf/wolf_collar.png");

    public RenderBear(ModelBase par1ModelBase, ModelBase par2ModelBase, float par3)
    {
        super(par1ModelBase, par3);
        this.setRenderPassModel(par2ModelBase);
    }

    /*
        //Defines what float the third param in setRotationAngles of ModelBase is
     
    protected float handleRotationFloat(EntityWolf par1EntityWolf, float par2)
    {
        return par1EntityWolf.getTailRotation();
    }
    */

    //Queries whether should render the specified pass or not.

    protected int shouldRenderPass(EntityBear par1EntityBear, int par2, float par3)
    {
        if (par2 == 0 && par1EntityBear.getBearShaking())
        {
            float f1 = par1EntityBear.getBrightness(par3) * par1EntityBear.getShadingWhileShaking(par3);
            this.bindTexture(bearTextures);
            GL11.glColor3f(f1, f1, f1);
            return 1;
        }
        else
        {
            return -1;
        }
    }

    //Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.

    protected ResourceLocation getEntityTexture(EntityBear par1EntityBear)
    {
        return bearTextures;
    }

    //Queries whether should render the specified pass or not.

    protected int shouldRenderPass(EntityLivingBase par1EntityLivingBase, int par2, float par3)
    {
        return this.shouldRenderPass((EntityBear)par1EntityLivingBase, par2, par3);
    }

    //Defines what float the third param in setRotationAngles of ModelBase is
    
    protected float handleRotationFloat(EntityLivingBase par1EntityLivingBase, float par2)
    {
        return this.handleRotationFloat(par1EntityLivingBase, par2);
    }

    //Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.

    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityBear)par1Entity);
    }
}