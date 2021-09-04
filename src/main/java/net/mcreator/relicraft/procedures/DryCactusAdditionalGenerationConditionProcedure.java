package net.mcreator.relicraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.relicraft.block.AntiqueSandBlock;
import net.mcreator.relicraft.RelicraftMod;

import java.util.Map;

public class DryCactusAdditionalGenerationConditionProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RelicraftMod.LOGGER.warn("Failed to load dependency x for procedure DryCactusAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RelicraftMod.LOGGER.warn("Failed to load dependency y for procedure DryCactusAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RelicraftMod.LOGGER.warn("Failed to load dependency z for procedure DryCactusAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RelicraftMod.LOGGER.warn("Failed to load dependency world for procedure DryCactusAdditionalGenerationCondition!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == AntiqueSandBlock.block)) {
			return (true);
		}
		return (false);
	}
}
