package fr.natixe.fab.init;

import java.util.ArrayList;
import java.util.List;

import fr.natixe.fab.objects.blocks.AntiBlock;
import fr.natixe.fab.objects.blocks.LeaveBlock;
import fr.natixe.fab.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block BLOCK_TUTO = new BlockBase("block_tuto", Material.ROCK);

	//Anti block

	public static final Block ANTIBLOCK_BLEU = new AntiBlock("antiblock_bleu", Material.ROCK);
	public static final Block ANTIBLOCK_BLEUCLAIRE = new AntiBlock("antiblock_bleuclaire", Material.ROCK);
	public static final Block ANTIBLOCK_JAUNE = new AntiBlock("antiblock_jaune", Material.ROCK);
	public static final Block ANTIBLOCK_ROUGE = new AntiBlock("antiblock_rouge", Material.ROCK);
	public static final Block ANTIBLOCK_VERT = new AntiBlock("antiblock_vert", Material.ROCK);
	public static final Block ANTIBLOCK_VIOLET = new AntiBlock("antiblock_violet", Material.ROCK);
	public static final Block ANTIBLOCK_NOIR = new AntiBlock("antiblock_noir", Material.ROCK);
	public static final Block ANTIBLOCK_BLANC = new AntiBlock("antiblock_blanc", Material.ROCK);

	//Block de deco

	public static final Block INDIGOT_BLOCK = new AntiBlock("indigot_block", Material.ROCK);
	public static final Block SHADOWINDIGOT_BLOCK = new AntiBlock("shadowindigot_block", Material.ROCK);
	public static final Block RED_STONE = new AntiBlock("red_stonebrick", Material.ROCK);
	public static final Block STONEBRICK_MOSSYGREEN = new AntiBlock("stonebrick_mossygreen", Material.ROCK);
	public static final Block COBBLESTONE_MOSSY = new AntiBlock("cobblestone_mossy", Material.ROCK);
	public static final Block ARDEN_STONE = new AntiBlock("arden_stone", Material.ROCK);
	public static final Block LAVA_ANDESITE = new AntiBlock("lava_andesite", Material.ROCK);
	public static final Block PODZOL_DIRT = new AntiBlock("podzol_dirt", Material.ROCK);
	public static final Block LAVA_CLAY = new AntiBlock("lava_clay", Material.ROCK);
	public static final Block STONE_DIRT = new AntiBlock("stone_dirt", Material.ROCK);

	//Leave

	public static final Block BUISSON = new LeaveBlock("buisson", Material.LEAVES);

}
