package openstreets;


import net.minecraft.block.material.Material;
import net.minecraft.item.ItemSlab;
import openstreets.block.BasicStreetBlock;

public class Blocks {

    public static void init(){
        BasicStreetBlock bsingle = new BasicStreetBlock(1000,false, Material.ground);
        BasicStreetBlock bDouble = new BasicStreetBlock(1001,true, Material.ground);

        (new ItemSlab(bsingle.blockID - 256, bsingle, bDouble, false)).setUnlocalizedName("stoneSlab");
        (new ItemSlab(bDouble.blockID - 256, bsingle, bDouble, true)).setUnlocalizedName("stoneSlab");

    }
}
