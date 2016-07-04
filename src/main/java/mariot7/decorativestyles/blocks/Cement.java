package mariot7.decorativestyles.blocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Cement extends BlockFalling{
	
	public Cement(Material materialIn) {
		super(materialIn);
		this.setHardness(0.5F);
		this.setSoundType(SoundType.SAND);
	}

}
