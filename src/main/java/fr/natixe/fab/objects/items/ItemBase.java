package fr.natixe.fab.objects.items;


import fr.natixe.fab.FAB;
import fr.natixe.fab.init.ItemInit;
import fr.natixe.fab.init.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		ItemInit.ITEMS.add(this);

	}

	@Override
	public void registerModel() {
		FAB.proxy.registerItemRenderer(this, 0);

	}
}
