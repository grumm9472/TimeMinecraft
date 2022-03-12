package net.en_jia.minecraft.forge.tpwa.abyss.time.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.en_jia.minecraft.forge.tpwa.abyss.time.item.BigBottleItem;
import net.en_jia.minecraft.forge.tpwa.abyss.time.TimeMod;

import java.util.Map;

public class NightVisionPotionFoodEatenProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure NightVisionPotionFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 18000, (int) 1, (false), (false)));
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(BigBottleItem.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
