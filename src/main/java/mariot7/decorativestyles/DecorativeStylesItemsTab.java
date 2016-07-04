package mariot7.decorativestyles;

import mariot7.decorativestyles.init.ItemListds;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DecorativeStylesItemsTab extends CreativeTabs{

	public DecorativeStylesItemsTab(String label) {
		super(label);
		this.setBackgroundImageName("DecorativeStylesTab.png");
	}

	@Override
	public Item getTabIconItem() {
		return ItemListds.jungle_brick;
	}

}
