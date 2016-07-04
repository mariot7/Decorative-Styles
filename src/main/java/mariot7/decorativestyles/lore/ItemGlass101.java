package mariot7.decorativestyles.lore;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemGlass101 extends ItemBlock{

	public ItemGlass101(Block block) {
		super(block);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean show){
		lines.add("Animated glass block");
	}

}
