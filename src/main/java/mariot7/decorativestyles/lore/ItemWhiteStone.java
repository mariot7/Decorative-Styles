package mariot7.decorativestyles.lore;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemWhiteStone extends ItemBlock{

	public ItemWhiteStone(Block block) {
		super(block);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean show){
		lines.add("It looks like a Marble");
	}

}
