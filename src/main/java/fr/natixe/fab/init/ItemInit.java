package fr.natixe.fab.init;

import java.util.ArrayList;
import java.util.List;

import fr.natixe.fab.objects.items.ItemBase;
import net.minecraft.item.Item;

public class ItemInit {

	public static List<Item> ITEMS = new ArrayList<Item>();

	//Materiaux
	public static final Item TEST = new ItemBase("test");

	//Specials
	public static final Item FIREBALL = new ItemBase("fireball");


}
