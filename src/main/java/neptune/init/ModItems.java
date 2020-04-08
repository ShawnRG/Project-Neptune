package neptune.init;

import neptune.NeptuneMod;
import neptune.common.item.ItemBinoculars;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author ShawnRG
 */
public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, NeptuneMod.MODID);
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () ->
            new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> BINOCULARS_ITEM = ITEMS.register("binoculars_item", ItemBinoculars::new);
}
