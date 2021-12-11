package SimpleMod;

import SimpleMod.init.ModSmelting;
import SimpleMod.proxy.CommonProxy;
import SimpleMod.tab.CreativeTabMod;
import SimpleMod.util.Data;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Data.MOD_ID, name = Data.NAME, version = Data.VERSION)
public class Main {
	
	public static CreativeTabMod MOD_TUB;
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Data.CLIENT_PROXY_CLASS, serverSide = Data.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		proxy.preInit();
		OBJLoader.INSTANCE.addDomain(Data.MOD_ID);
		MOD_TUB = new CreativeTabMod(CreativeTabs.getNextID(), "mod_tub");
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.init();
		ModSmelting.init();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event) {
		proxy.postInit();
	}

}
