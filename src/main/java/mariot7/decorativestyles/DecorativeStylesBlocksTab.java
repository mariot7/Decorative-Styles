package mariot7.decorativestyles;

import mariot7.decorativestyles.init.BlockListds;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DecorativeStylesBlocksTab extends CreativeTabs{

	public DecorativeStylesBlocksTab(String label) {
		super(label);
		this.setBackgroundImageName("DecorativeStylesTab.png");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(BlockListds.jungle_cobblestone);
	}

}
