package mariot7.decorativestyles.blocks;

import java.util.Random;

import mariot7.decorativestyles.init.BlockListds;
import mariot7.decorativestyles.init.ItemListds;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Pumice extends Block{
	
	public Pumice(Material materialIn) {
		super(materialIn);
		this.setHardness(1.5F);
		this.setSoundType(SoundType.STONE);
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune){ 
	return ItemListds.pumicite;
    }
    @Override
    public int quantityDropped(Random rand){
    return 4;
    }
    
}
           
 
    
   

  
    





