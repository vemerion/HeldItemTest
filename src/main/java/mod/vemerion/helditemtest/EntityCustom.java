package mod.vemerion.helditemtest;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityCustom extends EntityMob {
	public EntityCustom(World worldIn) {
		super(worldIn);
		setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.STONE_SWORD));
	}
}