package openstreet.block;


import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class BasicStreetBlock extends BlockHalfSlab {
    private static final String[] multiBlockNames = {
            "stone", "sand", "wood", "cobble", "brick", "smoothStoneBrick", "netherBrick", "quartz"
    };
    private static  ArrayList<Icon> iconList= new ArrayList<Icon>();

    public BasicStreetBlock(int id,boolean b, Material material) {
        super(id, b, material);
        this.setCreativeTab(CreativeTabs.tabBlock);
        setUnlocalizedName("os:street");
    }
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister par1IconRegister) {
        iconList = new ArrayList<Icon>();
        for(int i = 0;i<multiBlockNames.length;i++){
            iconList.add(par1IconRegister.registerIcon("os:"+getFullSlabName(i)))  ;
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int metadata) {
        return iconList.get(metadata);
    }

    @Override
    public int damageDropped(int metadata) {
        return metadata;
    }

    @Override
    public String getFullSlabName(int i) {
        if (i < 0 || i >= multiBlockNames.length)
        {
            i = 0;
        }
        return super.getUnlocalizedName() + "." + multiBlockNames[i];
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
        for(int i = 0;i<multiBlockNames.length;i++){
            ItemStack stack = new ItemStack(this,1,i);
            par3List.add(stack);
            LanguageRegistry.addName(stack, multiBlockNames[stack.getItemDamage()]);
        }
    }

    @Override
    public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity entity) {
        super.onEntityWalking(par1World, par2, par3, par4, entity);
        entity.motionX*=2;
        entity.motionZ*=2;

    }
}
