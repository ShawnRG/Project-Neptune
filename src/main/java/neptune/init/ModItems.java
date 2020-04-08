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
    public static final RegistryObject<Item> STEEL_COMPOUND_ITEM = ITEMS.register("steel_compound_item", () ->
            new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () ->
            new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
}
