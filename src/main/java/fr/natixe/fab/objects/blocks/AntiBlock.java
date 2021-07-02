package fr.natixe.fab.objects.blocks;

import fr.natixe.fab.FAB;
import fr.natixe.fab.init.BlockInit;
import fr.natixe.fab.init.ItemInit;
import fr.natixe.fab.init.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class AntiBlock extends Block implements IHasModel
{

	public AntiBlock(String name, Material material){
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FAB.BLOCKS_ARMY);
		setHardness(10.0F);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}

	@Override
	public void registerModel() {
		FAB.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
	}

}

