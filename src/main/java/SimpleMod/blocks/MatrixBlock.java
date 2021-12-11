package SimpleMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class MatrixBlock extends BlockBase {
	
	public MatrixBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.ANVIL);
		setBlockUnbreakable();
	}

    @Override
    public boolean isOpaqueCube(IBlockState blockState) {
        return false;
    }

	@Override
	public void onBlockDestroyedByExplosion(World worldIn, BlockPos pos, Explosion explosionIn)
	{
		worldIn.createExplosion((Entity)null, pos.getX(), pos.getY(), pos.getZ(), 30.0F, true);
	}
}


