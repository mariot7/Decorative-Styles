package mariot7.decorativestyles.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RustyBlock extends Block{
	
	public RustyBlock(Material materialIn) {
		super(materialIn);
		this.setHardness(0.8F);
		this.setSoundType(SoundType.STONE);
	}

}
