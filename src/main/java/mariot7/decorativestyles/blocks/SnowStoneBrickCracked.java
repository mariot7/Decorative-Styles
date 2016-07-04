package mariot7.decorativestyles.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SnowStoneBrickCracked extends Block{

	public SnowStoneBrickCracked(Material materialIn) {
		super(materialIn);
		this.setHardness(1.5F);
		this.setSoundType(SoundType.STONE);
	}

}

