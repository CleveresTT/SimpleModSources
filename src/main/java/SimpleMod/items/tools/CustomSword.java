package SimpleMod.items.tools;

import SimpleMod.Main;
import SimpleMod.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomSword extends ItemSword {

	public CustomSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MOD_TUB);
		
		ModItems.ITEMS.add(this);
	}

	@Override
    public EnumActionResult onItemUse(EntityPlayer playerIn, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (world.getBlockState(pos).getBlock() == Blocks.GRASS) {
            world.setBlockState(pos, Blocks.SOUL_SAND.getDefaultState());
			world.playSound((EntityPlayer)null, playerIn.getPosition(), SoundEvents.ENTITY_WITHER_SHOOT, SoundCategory.AMBIENT, 0.3F, 1.0F);
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.PASS;
    }
	
}

