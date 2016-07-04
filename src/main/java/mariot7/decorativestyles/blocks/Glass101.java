package mariot7.decorativestyles.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Glass101 extends BlockBreakable{

	
	public Glass101(Material materialIn, boolean IgnoreSimilarityIn) {
		super(materialIn, IgnoreSimilarityIn);
		this.setHardness(0.3F);
		this.setSoundType(SoundType.GLASS);
	}
 
	@Override
	public int quantityDropped(Random random)
    {
        return 0;
    }
	
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
	
    public boolean isFullCube()
    {
        return false;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean shouldSideBeRendered()
    {
    	return false;
    }
    
    public boolean canSilkHarvest()
    {
        return true;
    }

}
