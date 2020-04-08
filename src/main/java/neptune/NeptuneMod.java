package neptune;

import neptune.init.FOVUpdate;
import neptune.init.ModBlocks;
import neptune.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NeptuneMod.MODID)
public class NeptuneMod
{
    public static final String MODID = "neptune";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public NeptuneMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //MinecraftForge.EVENT_BUS.register(FOVUpdate.class);
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
    }
}
