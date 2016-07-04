package mariot7.decorativestyles.world;

import java.util.Random;

import mariot7.decorativestyles.init.BlockListds;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class PumiceWorldGeneratords implements IWorldGenerator{

		public WorldGenerator gen_pumice;
		public PumiceWorldGeneratords() {
		    this.gen_pumice = new WorldGenMinable(BlockListds.pumice.getDefaultState(), 10);
		}
		private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
		        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		    int heightDiff = maxHeight - minHeight + 1;
		    for (int i = 0; i < chancesToSpawn; i ++) {
		        int x = chunk_X * 16 + rand.nextInt(16);
		        int y = minHeight + rand.nextInt(heightDiff);
		        int z = chunk_Z * 16 + rand.nextInt(16);
		        generator.generate(world, rand, new net.minecraft.util.math.BlockPos(x, y, z));
		    }

	}
		@Override
		public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
				IChunkProvider chunkProvider) {
			switch (world.provider.getDimension()) {
		    case 0: //Overworld
		    this.runGenerator(this.gen_pumice, world, random, chunkX, chunkZ, 20, 0, 64);
			
		}
	}
 }
		

