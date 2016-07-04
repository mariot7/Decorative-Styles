package mariot7.decorativestyles.blocks;

import mariot7.decorativestyles.init.BlockListds;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class JungleCobblestone extends Block{

	public JungleCobblestone(Material materialIn) {
		super(materialIn);
		this.setHardness(1.5F);
		this.setSoundType(SoundType.STONE);
	}

}
