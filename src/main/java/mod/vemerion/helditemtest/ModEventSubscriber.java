package mod.vemerion.helditemtest;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;

@EventBusSubscriber(modid = Main.MODID)
public class ModEventSubscriber {
	
	public static EntityEntry ENTITY_CUSTOM = null;
	
	@SubscribeEvent
	public static void registerEntity(RegistryEvent.Register<EntityEntry> event) {
		ENTITY_CUSTOM = new EntityEntry(EntityCustom.class, ":entity_custom");
		ENTITY_CUSTOM.setRegistryName(Main.MODID, "entity_custom");
	    event.getRegistry().register(ENTITY_CUSTOM);
	}
}
