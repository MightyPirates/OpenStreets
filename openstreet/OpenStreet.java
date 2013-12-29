package openstreet;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="OpenStreet", name="Open Street", version="0.0.0")
@NetworkMod(clientSideRequired=true)

public class OpenStreet {
    // The instance of your mod that Forge uses.
    @Mod.Instance(value = "OpenStreet")
    public static OpenStreet instance;

    // Says where the client and server 'proxy' code is loaded.
    //@SidedProxy(clientSide="openstreet.CommonProxy", serverSide="openstreet.CommonProxy")
    public static CommonProxy proxy = new CommonProxy();

    @Mod.EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event) {
        proxy.load(event);
    }

    @Mod.EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
