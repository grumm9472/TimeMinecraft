
package net.en_jia.minecraft.forge.tpwa.abyss.time.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.en_jia.minecraft.forge.tpwa.abyss.time.itemgroup.TIMEItemGroup;
import net.en_jia.minecraft.forge.tpwa.abyss.time.block.ClassicPlanksBlock;
import net.en_jia.minecraft.forge.tpwa.abyss.time.TimeModElements;

@TimeModElements.ModElement.Tag
public class ClassicWoodenAxeItem extends TimeModElements.ModElement {
	@ObjectHolder("time:classic_wooden_axe")
	public static final Item block = null;

	public ClassicWoodenAxeItem(TimeModElements instance) {
		super(instance, 93);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ClassicPlanksBlock.block));
			}
		}, 1, -3f, new Item.Properties().group(TIMEItemGroup.tab)) {
		}.setRegistryName("classic_wooden_axe"));
	}
}
