package net.mcreator.relicraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.relicraft.block.DrycactuscorpsBlock;
import net.mcreator.relicraft.block.DryCactusBlock;
import net.mcreator.relicraft.RelicraftMod;

import java.util.Map;

public class DryCactusNeighbourBlockChangesProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RelicraftMod.LOGGER.warn("Failed to load dependency x for procedure DryCactusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RelicraftMod.LOGGER.warn("Failed to load dependency y for procedure DryCactusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RelicraftMod.LOGGER.warn("Failed to load dependency z for procedure DryCactusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RelicraftMod.LOGGER.warn("Failed to load dependency world for procedure DryCactusNeighbourBlockChanges!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == DryCactusBlock.block)) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = DrycactuscorpsBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
		} else if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == DrycactuscorpsBlock.block)
				&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR))) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = DryCactusBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR)) {
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		}
	}
}
