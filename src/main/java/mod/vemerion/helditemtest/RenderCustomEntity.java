package mod.vemerion.helditemtest;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderCustomEntity extends RenderLiving<EntityCustom> {
	// Completely transparent png
	public static final ResourceLocation TEXTURES = new ResourceLocation(Main.MODID, "textures/entity/nothing.png");

	public RenderCustomEntity(RenderManager manager) {
		super(manager, new ModelCustomEntity(), 0.5F);

		this.addLayer(new LayerHeldItem(this));
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCustom entity) {
		return TEXTURES;
	}
}