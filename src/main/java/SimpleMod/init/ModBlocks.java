package SimpleMod.init;

import java.util.ArrayList;
import java.util.List;

import SimpleMod.blocks.MatrixBlock;
import SimpleMod.blocks.RubyBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block MATRIX = new MatrixBlock("matrix", Material.ROCK);
}

