package mariot7.decorativestyles.lore;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RustyFlake extends Item{
	
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean adva){
		list.add("Iron that was in a water for a long, long time");
	}

}
