
package net.mcreator.relicraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.relicraft.itemgroup.RelicraftItemGroup;
import net.mcreator.relicraft.RelicraftModElements;

@RelicraftModElements.ModElement.Tag
public class InfusedMetalItem extends RelicraftModElements.ModElement {
	@ObjectHolder("relicraft:infused_metal")
	public static final Item block = null;
	public InfusedMetalItem(RelicraftModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(RelicraftItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("infused_metal");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
