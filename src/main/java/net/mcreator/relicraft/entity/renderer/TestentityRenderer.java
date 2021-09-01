package net.mcreator.relicraft.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.relicraft.entity.TestentityEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TestentityRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TestentityEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeltestentity(), 0.7f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("relicraft:textures/testentity.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modeltestentity extends EntityModel<Entity> {
		private final ModelRenderer bb_main;
		public Modeltestentity() {
			textureWidth = 64;
			textureHeight = 64;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(24, 24).addBox(-4.0F, -3.0F, 2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(16, 24).addBox(-4.0F, -6.0F, 2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(8, 24).addBox(2.0F, -3.0F, 2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 22).addBox(2.0F, -6.0F, 2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(10, 12).addBox(-4.0F, -3.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 12).addBox(2.0F, -3.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 5).addBox(-4.0F, -6.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 0).addBox(2.0F, -6.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 0).addBox(-5.0F, -8.0F, -5.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);
			bb_main.setTextureOffset(20, 15).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 2.0F, 1.0F, 0.0F, false);
			bb_main.setTextureOffset(20, 12).addBox(-5.0F, -10.0F, 4.0F, 10.0F, 2.0F, 1.0F, 0.0F, false);
			bb_main.setTextureOffset(10, 14).addBox(-5.0F, -10.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 12).addBox(4.0F, -10.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
			bb_main.setTextureOffset(6, 5).addBox(-2.0F, -9.0F, -5.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bb_main.setTextureOffset(6, 0).addBox(1.0F, -9.0F, -5.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}