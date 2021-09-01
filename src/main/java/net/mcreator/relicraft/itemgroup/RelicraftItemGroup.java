
package net.mcreator.relicraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.relicraft.item.InfusingPowderItem;
import net.mcreator.relicraft.RelicraftModElements;

@RelicraftModElements.ModElement.Tag
public class RelicraftItemGroup extends RelicraftModElements.ModElement {
	public RelicraftItemGroup(RelicraftModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabrelicraft") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(InfusingPowderItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
