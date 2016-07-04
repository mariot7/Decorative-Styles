package mariot7.decorativestyles.init;

import mariot7.decorativestyles.lore.ItemJungleCobblestone;
import mariot7.decorativestyles.lore.Pumicite;
import mariot7.decorativestyles.lore.RustyFlake;
import mariot7.decorativestyles.Main;
import mariot7.decorativestyles.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemListds {
	
	public static Item jungle_brick;
	public static Item jungle_clay_ball;
	public static Item white_brick;
	public static Item white_clay_ball;
	public static Item snow_brick;
	public static Item snow_clay_ball;
	public static Item pumicite;
	public static Item pumice_brick;
	public static Item pumice_clay_ball;
	public static Item rusty_flake;
	
	public static void init(){
		jungle_brick = new Item().setUnlocalizedName("jungle_brick").setCreativeTab(Main.tabDecorativeStylesItems);
		jungle_clay_ball = new Item().setUnlocalizedName("jungle_clay_ball").setCreativeTab(Main.tabDecorativeStylesItems);
		white_brick = new Item().setUnlocalizedName("white_brick").setCreativeTab(Main.tabDecorativeStylesItems);
		white_clay_ball = new Item().setUnlocalizedName("white_clay_ball").setCreativeTab(Main.tabDecorativeStylesItems);
		snow_brick = new Item().setUnlocalizedName("snow_brick").setCreativeTab(Main.tabDecorativeStylesItems);
		snow_clay_ball = new Item().setUnlocalizedName("snow_clay_ball").setCreativeTab(Main.tabDecorativeStylesItems);
		pumicite = new Pumicite().setUnlocalizedName("pumicite").setCreativeTab(Main.tabDecorativeStylesItems);
		pumice_brick = new Item().setUnlocalizedName("pumice_brick").setCreativeTab(Main.tabDecorativeStylesItems);
		pumice_clay_ball = new Item().setUnlocalizedName("pumice_clay_ball").setCreativeTab(Main.tabDecorativeStylesItems);
		rusty_flake = new RustyFlake().setUnlocalizedName("rusty_flake").setCreativeTab(Main.tabDecorativeStylesItems);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(jungle_brick, jungle_brick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(jungle_clay_ball, jungle_clay_ball.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(white_brick, white_brick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(white_clay_ball, white_clay_ball.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(snow_brick, snow_brick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(snow_clay_ball, snow_clay_ball.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pumicite, pumicite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pumice_brick, pumice_brick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pumice_clay_ball, pumice_clay_ball.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rusty_flake, rusty_flake.getUnlocalizedName().substring(5));
	}

	public static void registerRenders()
	{
		registerRender(jungle_brick);
		registerRender(jungle_clay_ball);
		registerRender(white_brick);
		registerRender(white_clay_ball);
		registerRender(snow_brick);
		registerRender(snow_clay_ball);
		registerRender(pumicite);
		registerRender(pumice_brick);
		registerRender(pumice_clay_ball);
		registerRender(rusty_flake);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
