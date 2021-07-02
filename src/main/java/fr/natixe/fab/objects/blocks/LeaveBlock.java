package fr.natixe.fab.objects.blocks;

import fr.natixe.fab.FAB;
import fr.natixe.fab.init.BlockInit;
import fr.natixe.fab.init.ItemInit;
import fr.natixe.fab.init.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class LeaveBlock extends Block implements IHasModel
{

	public LeaveBlock(String name, Material material){
		super(material.LEAVES);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FAB.BLOCKS_ARMY);
		setHardness(0.2F);
		setLightOpacity(1);
		BlockInit.BLOCKS.add(this);
		setSoundType(SoundType.PLANT);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}

	@Override
	public void registerModel() {
		FAB.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
	}

}

