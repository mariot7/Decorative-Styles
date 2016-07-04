package mariot7.decorativestyles.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class JungleStoneBrickCracked extends Block{
	
	public JungleStoneBrickCracked(Material materialIn) {
		super(materialIn);
	    this.setHardness(1.5F);
	    this.setSoundType(SoundType.STONE);
	}

}

