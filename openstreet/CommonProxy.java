package openstreet;


import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {


    public void preInit(FMLPreInitializationEvent event) {
        Blocks.init();
    }

    public void load(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

}
