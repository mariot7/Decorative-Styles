package mariot7.decorativestyles.blocks;

import java.util.Collection;

import com.google.common.collect.ImmutableMap;

import mariot7.decorativestyles.Main;
import mariot7.decorativestyles.init.BlockListds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;

public class WoodenStairs extends BlockStairs{

	public WoodenStairs(Block block) {
		this(block.getDefaultState());
	}
	
	public WoodenStairs(Block block, int meta) {
		this(block.getStateFromMeta(meta));
	}

	public WoodenStairs(IBlockState state) {
		super(state);
		this.setHardness(2.0F);
		this.setLightOpacity(0);
		this.setSoundType(SoundType.WOOD);
		this.useNeighborBrightness = true;
	}

	
}
