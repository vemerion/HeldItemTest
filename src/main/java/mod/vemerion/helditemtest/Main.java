package mod.vemerion.helditemtest;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, version = "1.0.0")
public class Main {
	public static final String MODID = "helditemtest";
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, RenderCustomEntity::new);
	}
}
