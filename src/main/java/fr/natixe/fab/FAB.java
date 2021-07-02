package fr.natixe.fab;

import fr.natixe.fab.tabs.BlockTab;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.core.Logger;

import fr.natixe.fab.proxy.CommonProxy;
import fr.natixe.fab.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, name= Reference.NAME, version = Reference.VERSION)

public class FAB {
	@Instance
	public static FAB instance;

	public static final CreativeTabs BLOCKS_ARMY = new BlockTab("Block_Army");

	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;

	public static org.apache.logging.log4j.Logger logger;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();

		proxy.preInit();
	}

	@EventHandler
	public static void init(FMLInitializationEvent e) {
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent e) {
	}

}
