package mariot7.decorativestyles;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import mariot7.decorativestyles.init.BlockListds;
import mariot7.decorativestyles.init.Craftingds;
import mariot7.decorativestyles.init.ItemListds;
import mariot7.decorativestyles.init.Smeltingds;
import mariot7.decorativestyles.proxy.CommonProxy;
import mariot7.decorativestyles.world.PumiceWorldGeneratords;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, updateJSON = Reference.updateJSON)
public class Main {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	public static final DecorativeStylesBlocksTab tabDecorativeStylesBlocks = new DecorativeStylesBlocksTab("tabDecorativeStylesBlocks");
	public static final DecorativeStylesItemsTab tabDecorativeStylesItems = new DecorativeStylesItemsTab("tabDecorativeStylesItems");
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		BlockListds.init();
		BlockListds.register();
		ItemListds.init();
		ItemListds.register();
	}
	
    private Block registerBlock (Block block, String ID)
    { 
        block.setRegistryName(ID);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        return block;
    }
    
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		proxy.registerRenders();
		Craftingds.RegisterCrafting();
		Smeltingds.SmeltingRegistry();
		GameRegistry.registerWorldGenerator(new PumiceWorldGeneratords(), 0);
    }
    
	@EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
	
	
}

	


