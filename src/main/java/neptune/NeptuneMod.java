package neptune;


import neptune.init.ModBlocks;
import neptune.init.ModItems;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(NeptuneMod.MODID)
public class NeptuneMod
{
    public static final String MODID = "neptune";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public NeptuneMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
    }
}
