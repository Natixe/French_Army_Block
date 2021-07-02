package fr.natixe.fab.util.handlers;

import fr.natixe.fab.init.BlockInit;
import fr.natixe.fab.init.ItemInit;
import fr.natixe.fab.init.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event){
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}

	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event){
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}


	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModel();
			}
		}

		for(Block block : BlockInit.BLOCKS){
			if(block instanceof IHasModel){
				((IHasModel)block).registerModel();
			}
		}
	}
	public static void preInitRegistries(){

	}

	public static void initRegistries(){

	}
}
