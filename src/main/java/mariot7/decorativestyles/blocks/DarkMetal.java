package mariot7.decorativestyles.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DarkMetal extends Block{

	public DarkMetal(Material materialIn) {
		super(materialIn);
		this.setHardness(5.0F);
		this.setSoundType(SoundType.STONE);
	}

}


