package neptune;

import neptune.init.ModBlocks;
import neptune.init.ModItemGroups;
import neptune.init.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.BlastingRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

import static neptune.NeptuneMod.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {
    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> itemRegister) {
        final IForgeRegistry<Item> registry = itemRegister.getRegistry();


        ModBlocks.BLOCKS.getEntries()
                .stream()
                .map(RegistryObject::get)
                .map(block -> {
                    final Item.Properties properties = new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP);
                    final BlockItem blockItem = new BlockItem(block, properties);
                    return blockItem.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
                })
                .forEach(registry::register);


/*
        CookingRecipeBuilder
                .blastingRecipe(Ingredient.fromItems(ModItems.STEEL_COMPOUND_ITEM.get()),
                                            ModItems.STEEL_INGOT_ITEM.get(), 0, 200)
                .build(input -> {}, new ResourceLocation(MODID, "steel_ingot_recipe"));
*/

    }

}
