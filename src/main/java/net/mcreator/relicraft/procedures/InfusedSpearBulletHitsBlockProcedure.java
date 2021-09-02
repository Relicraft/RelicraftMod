package net.mcreator.relicraft.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.relicraft.particle.InfusedParticleParticle;
import net.mcreator.relicraft.item.InfusedSpearItem;
import net.mcreator.relicraft.RelicraftMod;

import java.util.Map;

public class InfusedSpearBulletHitsBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RelicraftMod.LOGGER.warn("Failed to load dependency x for procedure InfusedSpearBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RelicraftMod.LOGGER.warn("Failed to load dependency y for procedure InfusedSpearBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RelicraftMod.LOGGER.warn("Failed to load dependency z for procedure InfusedSpearBulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RelicraftMod.LOGGER.warn("Failed to load dependency world for procedure InfusedSpearBulletHitsBlock!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() <= 0.75)) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(InfusedSpearItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		} else {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(InfusedParticleParticle.particle, x, y, z, (int) 5, 0, 0, 0, 1);
			}
		}
	}
}
