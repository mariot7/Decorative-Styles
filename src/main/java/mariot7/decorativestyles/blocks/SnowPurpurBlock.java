package mariot7.decorativestyles.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SnowPurpurBlock extends Block{
	
	public SnowPurpurBlock(Material materialIn) {
		super(materialIn);
		this.setHardness(2.0F);
		this.setSoundType(SoundType.STONE);
	}

}


