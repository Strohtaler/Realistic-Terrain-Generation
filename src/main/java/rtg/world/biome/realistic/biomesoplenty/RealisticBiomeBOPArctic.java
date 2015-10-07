package rtg.world.biome.realistic.biomesoplenty;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import rtg.config.ConfigBOP;
import rtg.world.biome.BiomeBase;
import rtg.world.biome.BiomeBase.BiomeCategory;
import rtg.world.gen.surface.biomesoplenty.SurfaceBOPArctic;
import rtg.world.gen.terrain.biomesoplenty.TerrainBOPArctic;
import biomesoplenty.api.content.BOPCBiomes;

public class RealisticBiomeBOPArctic extends RealisticBiomeBOPBase
{	
	public static BiomeGenBase bopBiome = BOPCBiomes.arctic;
	
	public static Block topBlock = bopBiome.topBlock;
	public static Block fillerBlock = bopBiome.fillerBlock;
	
	public RealisticBiomeBOPArctic()
	{
		super(
			bopBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, BiomeBase.Climate.ICE),
			new TerrainBOPArctic(),
			new SurfaceBOPArctic(topBlock, fillerBlock)
		);
		
		this.setRealisticBiomeName("BOP Arctic");
		this.biomeCategory = BiomeCategory.SNOW;
		this.biomeWeight = ConfigBOP.weightBOParctic;
	}
}