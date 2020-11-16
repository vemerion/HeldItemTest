package mod.vemerion.helditemtest;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;

public class ModelCustomEntity extends ModelBiped {
	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}
}
