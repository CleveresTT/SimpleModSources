package SimpleMod.tab;

import SimpleMod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabMod extends CreativeTabs {
	
	public CreativeTabMod(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.RUBY);
    }
    
}
