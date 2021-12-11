package SimpleMod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.RUBY_BLOCK, new ItemStack(Blocks.DIAMOND_BLOCK, 1), 1.5f);
		GameRegistry.addSmelting(Items.DIAMOND, new ItemStack(ModItems.RUBY, 2), 3.0f);
	}
}

