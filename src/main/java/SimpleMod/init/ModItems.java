package SimpleMod.init;

import java.util.ArrayList;
import java.util.List;

import SimpleMod.items.ItemBase;
import SimpleMod.items.armor.ArmorBase;
import SimpleMod.items.tools.CustomSword;
import SimpleMod.items.tools.ToolAxe;
import SimpleMod.items.tools.ToolHoe;
import SimpleMod.items.tools.ToolPickaxe;
import SimpleMod.items.tools.ToolSpade;
import SimpleMod.items.tools.ToolSword;
import SimpleMod.util.Data;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();

	//Items
	public static final Item RUBY = new ItemBase("ruby");

	//Materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 250, 100.0F, 40000.0F, 30);
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Data.MOD_ID + ":ruby", 40,
			new int[] {2, 5, 7, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);

	public static final ArmorMaterial PURE_LEATHER = EnumHelper.addArmorMaterial("armor_material_pl", Data.MOD_ID + ":pl", 1,
			new int[] {2, 1, 2, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	//Tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	//Custom models
	public static final ItemSword LOTR_SWORD_1 = new CustomSword("lotr_sword_1", ToolMaterial.IRON);
	public static final ItemSword LOTR_SWORD_2 = new CustomSword("lotr_sword_2", ToolMaterial.GOLD);
	public static final ItemSword LOTR_SWORD_3 = new CustomSword("lotr_sword_3", ToolMaterial.GOLD);
	public static final ItemSword LOTR_SWORD_4 = new CustomSword("lotr_sword_4", ToolMaterial.GOLD);
	
	public static final ItemSword LOTR_SPEAR_1 = new CustomSword("lotr_spear_1", ToolMaterial.DIAMOND);
	
	//Armor
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);

	public static final Item PURE_LEATHER_MASK = new ArmorBase("pl_mask", PURE_LEATHER, 1, EntityEquipmentSlot.HEAD);
	public static final Item PURE_LEATHER_BANDS = new ArmorBase("pl_bands", PURE_LEATHER, 1, EntityEquipmentSlot.CHEST);
	public static final Item PURE_LEATHER_PANTS = new ArmorBase("pl_pants", PURE_LEATHER, 2, EntityEquipmentSlot.LEGS);
	public static final Item PURE_LEATHER_BOOTS = new ArmorBase("pl_boots", PURE_LEATHER, 1, EntityEquipmentSlot.FEET);
}
