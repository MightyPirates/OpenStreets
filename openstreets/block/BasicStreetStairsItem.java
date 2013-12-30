package openstreets.block;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by lordjoda on 30.12.13.
 */
public class BasicStreetStairsItem extends ItemBlock {
    public BasicStreetStairsItem(int par1) {
        super(par1);

        setHasSubtypes(true);
    }

    @Override
    public int getMetadata (int damageValue) {
        return damageValue;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        return getUnlocalizedName() + "." + BasicStreetBlock.getMultiBlockNames()[itemstack.getItemDamage()];
    }
}
