package openstreets.block;


import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import java.util.ArrayList;
import java.util.List;

public class BasicStreetStairs extends BlockStairs {

    protected Block modelBlock;

    public BasicStreetStairs(int id, Block modelBlock, int modelBlockMetadata) {
        super(id, modelBlock, modelBlockMetadata);
        this.modelBlock = modelBlock;
        setUnlocalizedName("os.stair");
    }
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int par1, int par2) {
        return modelBlock.getIcon(par1, par2);
    }

    @Override
    public int damageDropped(int metadata) {
        return metadata;
    }
    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
        ArrayList<ItemStack> testList = new ArrayList<ItemStack>();
        modelBlock.getSubBlocks(par1, par2CreativeTabs, testList);
        for (int i = 0; i < testList.size(); i++) {
            ItemStack stack = new ItemStack(this, 1, i);
            par3List.add(stack);
        }
    }
}
