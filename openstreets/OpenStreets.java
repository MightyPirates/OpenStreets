package openstreets;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="OpenStreets", name="Open Streets", version="0.0.0")
@NetworkMod(clientSideRequired=true)

public class OpenStreets {
    // The instance of your mod that Forge uses.
    @Mod.Instance(value = "OpenStreets")
    public static OpenStreets instance;

    // Says where the client and server 'proxy' code is loaded.
    //@SidedProxy(clientSide="openstreets.CommonProxy", serverSide="openstreets.CommonProxy")
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
