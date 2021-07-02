package fr.natixe.fab.tabs;

import fr.natixe.fab.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlockTab extends CreativeTabs {
	public BlockTab(String label){
		super(label);
		this.setBackgroundImageName(label);
	}

	@Override
	public ItemStack getTabIconItem(){
		return new ItemStack(ItemInit.FIREBALL);
	}

}
