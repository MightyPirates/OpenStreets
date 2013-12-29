package openstreet.block;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import java.util.List;

public class BasicStreetBlock extends BlockHalfSlab {
    private static final String[] multiBlockNames = {
            "NameOne", "NameTwo"
    };

    public BasicStreetBlock(int id,boolean b, Material material) {
        super(id,b, material);
        this.setCreativeTab(CreativeTabs.tabBlock);
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
            par3List.add(new ItemStack(this,1,i));
        }
    }

}
