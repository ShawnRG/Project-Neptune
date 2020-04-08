package neptune.init;

import neptune.NeptuneMod;
import neptune.common.item.ItemBinoculars;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author ShawnRG
 */
@Mod.EventBusSubscriber
public class FOVUpdate {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final float FOV = 0.1f;

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onFOVUpdate(final FOVUpdateEvent updateEvent) {
        final Item item = updateEvent.getEntity()
                .getHeldItemMainhand()
                .getItem();
        if (item instanceof ItemBinoculars &&
                ((ItemBinoculars) item).isInUse()
        ) {
           updateEvent.setNewfov(FOV);
        }
    }
}
