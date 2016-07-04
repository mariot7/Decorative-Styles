package mariot7.decorativestyles.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Craftingds {

	public static void RegisterCrafting(){
		//shaped
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.cement), new Object[]{" C ", "CSC"," C ", 'C', Blocks.CLAY, 'S', Blocks.SAND});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.concrete_masonry_unit,4), new Object[]{" X ", "XCX"," X ", 'X', BlockListds.cement, 'C', BlockListds.concrete});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jungle_cobblestone,4), new Object[]{"VCV", "CSC", "VCV", 'S', Blocks.SAND, 'V', Blocks.VINE, 'C', Blocks.COBBLESTONE});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jungle_polished_stone), new Object[]{"CC ", "CC ", "   ", 'C', BlockListds.jungle_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jungle_polished_stone), new Object[]{" CC", " CC", "   ", 'C', BlockListds.jungle_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jungle_polished_stone), new Object[]{"   ", "CC ", "CC ", 'C', BlockListds.jungle_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jungle_polished_stone), new Object[]{"   ", " CC", " CC", 'C', BlockListds.jungle_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jungle_stonebrick,4), new Object[]{"BB ", "BB ","   ", 'B', BlockListds.jungle_stone});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jungle_stonebrick,4), new Object[]{" BB", " BB","   ", 'B', BlockListds.jungle_stone});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jungle_stonebrick,4), new Object[]{"   ", "BB ","BB ", 'B', BlockListds.jungle_stone});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jungle_stonebrick,4), new Object[]{"   ", " BB"," BB", 'B', BlockListds.jungle_stone});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jungle_brick_block), new Object[]{"BB ", "BB ","   ", 'B', ItemListds.jungle_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jungle_brick_block), new Object[]{" BB", " BB","   ", 'B', ItemListds.jungle_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jungle_brick_block), new Object[]{"   ", "BB ","BB ", 'B', ItemListds.jungle_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jungle_brick_block), new Object[]{"   ", " BB"," BB", 'B', ItemListds.jungle_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jungle_purpur_block,4), new Object[]{" S ", "SXS", " S ", 'S', BlockListds.jungle_stonebrick, 'X', BlockListds.jungle_stone});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jungle_concrete_masonry_unit,4), new Object[]{" X ", "XCX"," X ", 'X', BlockListds.jungle_cobblestone, 'C', BlockListds.concrete});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.white_cobblestone,4), new Object[]{" C ", "CDC", " C ", 'C', Blocks.COBBLESTONE, 'D', Items.BONE});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.white_polished_stone), new Object[]{"CC ", "CC ", "   ", 'C', BlockListds.white_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.white_polished_stone), new Object[]{" CC", " CC", "   ", 'C', BlockListds.white_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.white_polished_stone), new Object[]{"   ", "CC ", "CC ", 'C', BlockListds.white_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.white_polished_stone), new Object[]{"   ", " CC", " CC", 'C', BlockListds.white_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.white_stonebrick,4), new Object[]{"BB ", "BB ","   ", 'B', BlockListds.white_stone});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.white_stonebrick,4), new Object[]{" BB", " BB","   ", 'B', BlockListds.white_stone});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.white_stonebrick,4), new Object[]{"   ", "BB ","BB ", 'B', BlockListds.white_stone});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.white_stonebrick,4), new Object[]{"   ", " BB"," BB", 'B', BlockListds.white_stone});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.white_brick_block), new Object[]{"BB ", "BB ","   ", 'B', ItemListds.white_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.white_brick_block), new Object[]{" BB", " BB","   ", 'B', ItemListds.white_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.white_brick_block), new Object[]{"   ", "BB ","BB ", 'B', ItemListds.white_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.white_brick_block), new Object[]{"   ", " BB"," BB", 'B', ItemListds.white_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.white_purpur_block,4), new Object[]{" S ", "SXS", " S ", 'S', BlockListds.white_stonebrick, 'X', BlockListds.white_stone});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.white_concrete_masonry_unit,4), new Object[]{" X ", "XCX"," X ", 'X', BlockListds.white_cobblestone, 'C', BlockListds.concrete});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.snow_cobblestone,4), new Object[]{" C ", "CDC", " C ", 'C', Blocks.COBBLESTONE, 'D', Items.SNOWBALL});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.snow_polished_stone), new Object[]{"CC ", "CC ", "   ", 'C', BlockListds.snow_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.snow_polished_stone), new Object[]{" CC", " CC", "   ", 'C', BlockListds.snow_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.snow_polished_stone), new Object[]{"   ", "CC ", "CC ", 'C', BlockListds.snow_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.snow_polished_stone), new Object[]{"   ", " CC", " CC", 'C', BlockListds.snow_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.snow_stonebrick,4), new Object[]{"BB ", "BB ","   ", 'B', BlockListds.snow_stone});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.snow_stonebrick,4), new Object[]{" BB", " BB","   ", 'B', BlockListds.snow_stone});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.snow_stonebrick,4), new Object[]{"   ", "BB ","BB ", 'B', BlockListds.snow_stone});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.snow_stonebrick,4), new Object[]{"   ", " BB"," BB", 'B', BlockListds.snow_stone});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.snow_brick_block), new Object[]{"BB ", "BB ","   ", 'B', ItemListds.snow_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.snow_brick_block), new Object[]{" BB", " BB","   ", 'B', ItemListds.snow_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.snow_brick_block), new Object[]{"   ", "BB ","BB ", 'B', ItemListds.snow_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.snow_brick_block), new Object[]{"   ", " BB"," BB", 'B', ItemListds.snow_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.snow_purpur_block,4), new Object[]{" S ", "SXS", " S ", 'S', BlockListds.snow_stonebrick, 'X', BlockListds.snow_stone});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.snow_concrete_masonry_unit,4), new Object[]{" X ", "XCX"," X ", 'X', BlockListds.snow_cobblestone, 'C', BlockListds.concrete});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.pumice), new Object[]{"PP ", "PP ", "   ", 'P', ItemListds.pumicite});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.pumice), new Object[]{" PP", " PP", "   ", 'P', ItemListds.pumicite});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.pumice), new Object[]{"   ", "PP ", "PP ", 'P', ItemListds.pumicite});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.pumice), new Object[]{"   ", " PP", " PP", 'P', ItemListds.pumicite});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.polished_pumice), new Object[]{"CC ", "CC ", "   ", 'C', BlockListds.pumice_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.polished_pumice), new Object[]{" CC", " CC", "   ", 'C', BlockListds.pumice_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.polished_pumice), new Object[]{"   ", "CC ", "CC ", 'C', BlockListds.pumice_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.polished_pumice), new Object[]{"   ", " CC", " CC", 'C', BlockListds.pumice_stonebrick_carved});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.pumice_stonebrick,4), new Object[]{"BB ", "BB ","   ", 'B', BlockListds.pumice});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.pumice_stonebrick,4), new Object[]{" BB", " BB","   ", 'B', BlockListds.pumice});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.pumice_stonebrick,4), new Object[]{"   ", "BB ","BB ", 'B', BlockListds.pumice});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.pumice_stonebrick,4), new Object[]{"   ", " BB"," BB", 'B', BlockListds.pumice});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.pumice_brick_block), new Object[]{"BB ", "BB ","   ", 'B', ItemListds.pumice_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.pumice_brick_block), new Object[]{" BB", " BB","   ", 'B', ItemListds.pumice_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.pumice_brick_block), new Object[]{"   ", "BB ","BB ", 'B', ItemListds.pumice_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.pumice_brick_block), new Object[]{"   ", " BB"," BB", 'B', ItemListds.pumice_brick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.pumice_purpur_block,4), new Object[]{" S ", "SXS", " S ", 'S', BlockListds.pumice_stonebrick, 'X', BlockListds.pumice});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.pumice_masonry_unit,4), new Object[]{" X ", "XCX"," X ", 'X', BlockListds.pumice, 'C', BlockListds.concrete});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.rusty_block), new Object[]{"XXX", "XXX", "XXX", 'X', ItemListds.rusty_flake});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.dark_metal), new Object[]{" I ", "IXI", " I ", 'I', Items.COAL, 'X', Blocks.IRON_BLOCK});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.jail_glass,2), new Object[]{" I ", "IXI", " I ", 'I', Blocks.IRON_BARS, 'X', BlockListds.clear_glass});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.quartz_glass), new Object[]{" I ", "IXI", " I ", 'I', Items.QUARTZ, 'X', Blocks.GLASS});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.pumice_glass,4), new Object[]{" I ", "IXI", " I ", 'I', BlockListds.pumice, 'X', Blocks.GLASS});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListds.glass_101,4), new Object[]{" I ", "IXI", " I ", 'I', BlockListds.clear_glass, 'X', BlockListds.checked_glass});
		
		//shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.concrete_tiles), BlockListds.concrete, Items.STICK);
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.jungle_mossy_cobblestone), Blocks.VINE, BlockListds.jungle_cobblestone);
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.jungle_mossy_stonebrick), Blocks.VINE, BlockListds.jungle_stonebrick);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListds.jungle_clay_ball), Items.CLAY_BALL, Blocks.SAND, Blocks.VINE);
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.white_mossy_cobblestone), Blocks.VINE, BlockListds.white_cobblestone);
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.white_mossy_stonebrick), Blocks.VINE, BlockListds.white_stonebrick);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListds.white_clay_ball), Items.CLAY_BALL, Items.BONE);
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.snow_mossy_cobblestone), Blocks.VINE, BlockListds.snow_cobblestone);
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.snow_mossy_stonebrick), Blocks.VINE, BlockListds.snow_stonebrick);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListds.snow_clay_ball), Items.CLAY_BALL, Items.SNOWBALL);
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.pumice_mossy_stonebrick), Blocks.VINE, BlockListds.pumice_stonebrick);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListds.pumice_clay_ball), Items.CLAY_BALL, ItemListds.pumicite);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListds.rusty_flake,3), Items.IRON_INGOT, Items.WATER_BUCKET);
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.oak_wood_parquet), new Object[]{new ItemStack(Blocks.PLANKS, 1, 0), (Items.STICK)});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.birch_wood_parquet), new Object[]{new ItemStack(Blocks.PLANKS, 1, 2), (Items.STICK)});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.spruce_wood_parquet), new Object[]{new ItemStack(Blocks.PLANKS, 1, 1), (Items.STICK)});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.jungle_wood_parquet), new Object[]{new ItemStack(Blocks.PLANKS, 1, 3), (Items.STICK)});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.acacia_wood_parquet), new Object[]{new ItemStack(Blocks.PLANKS, 1, 4), (Items.STICK)});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.darkoak_wood_parquet), new Object[]{new ItemStack(Blocks.PLANKS, 1, 5), (Items.STICK)});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.carved_stone_1), new Object[]{new ItemStack(Blocks.STONE_SLAB, 1, 0), (BlockListds.concrete)});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.carved_stone_2), new Object[]{new ItemStack(Blocks.STONE_SLAB, 1, 5), (BlockListds.concrete)});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.carved_stone_3), new Object[]{new ItemStack(Blocks.STONE_SLAB, 1, 3), (BlockListds.concrete)});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockListds.checked_glass), new Object[]{new ItemStack(Items.DYE, 1, 3), (BlockListds.clear_glass)});

		}	

}
