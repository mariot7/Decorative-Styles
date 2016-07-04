package mariot7.decorativestyles.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Smeltingds {
	public static void SmeltingRegistry(){
		GameRegistry.addSmelting(BlockListds.cement, new ItemStack(BlockListds.concrete), 1F);
		GameRegistry.addSmelting(BlockListds.jungle_cobblestone, new ItemStack(BlockListds.jungle_stone), 1F);
		GameRegistry.addSmelting(BlockListds.jungle_stone, new ItemStack(BlockListds.jungle_polished_stone), 1F);
		GameRegistry.addSmelting(BlockListds.jungle_stonebrick, new ItemStack(BlockListds.jungle_stonebrick_cracked), 1F);
		GameRegistry.addSmelting(BlockListds.jungle_stonebrick_cracked, new ItemStack(BlockListds.jungle_stonebrick_carved), 1F);
		GameRegistry.addSmelting(ItemListds.jungle_clay_ball, new ItemStack(ItemListds.jungle_brick), 1F);
		GameRegistry.addSmelting(BlockListds.white_cobblestone, new ItemStack(BlockListds.white_stone), 1F);
		GameRegistry.addSmelting(BlockListds.white_stone, new ItemStack(BlockListds.white_polished_stone), 1F);
		GameRegistry.addSmelting(BlockListds.white_stonebrick, new ItemStack(BlockListds.white_stonebrick_cracked), 1F);
		GameRegistry.addSmelting(BlockListds.white_stonebrick_cracked, new ItemStack(BlockListds.white_stonebrick_carved), 1F);
		GameRegistry.addSmelting(ItemListds.white_clay_ball, new ItemStack(ItemListds.white_brick), 1F);
		GameRegistry.addSmelting(BlockListds.snow_cobblestone, new ItemStack(BlockListds.snow_stone), 1F);
		GameRegistry.addSmelting(BlockListds.snow_stone, new ItemStack(BlockListds.snow_polished_stone), 1F);
		GameRegistry.addSmelting(BlockListds.snow_stonebrick, new ItemStack(BlockListds.snow_stonebrick_cracked), 1F);
		GameRegistry.addSmelting(BlockListds.snow_stonebrick_cracked, new ItemStack(BlockListds.snow_stonebrick_carved), 1F);
		GameRegistry.addSmelting(ItemListds.snow_clay_ball, new ItemStack(ItemListds.snow_brick), 1F);
		GameRegistry.addSmelting(BlockListds.pumice, new ItemStack(BlockListds.polished_pumice), 1F);
		GameRegistry.addSmelting(BlockListds.pumice_stonebrick, new ItemStack(BlockListds.pumice_stonebrick_cracked), 1F);
		GameRegistry.addSmelting(BlockListds.pumice_stonebrick_cracked, new ItemStack(BlockListds.pumice_stonebrick_carved), 1F);
		GameRegistry.addSmelting(ItemListds.pumice_clay_ball, new ItemStack(ItemListds.pumice_brick), 1F);
		GameRegistry.addSmelting(Blocks.GLASS, new ItemStack(BlockListds.clear_glass), 1F);
		 
	}

}
