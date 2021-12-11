package SimpleMod.proxy;

import SimpleMod.init.ModBlocks;
import SimpleMod.init.ModItems;
import SimpleMod.util.Data;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(
	    modid = Data.MOD_ID,
	    value = {Side.CLIENT}
)
public class ClientProxy extends CommonProxy
{
	public ClientProxy() {
    }

    public void preInit() {
    }

    public void init() {
    }

    public void postInit() {
    }
    
    
    @SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
    public static void onRegisterModelsEvent(ModelRegistryEvent e) {
    	for(Item item : ModItems.ITEMS){
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }
}
