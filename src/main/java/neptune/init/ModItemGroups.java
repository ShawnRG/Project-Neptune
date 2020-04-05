package neptune.init;

import neptune.NeptuneMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

/**
 * @author ShawnRG
 */
public class ModItemGroups {

    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(NeptuneMod.MODID, () ->
            new ItemStack(ModItems.EXAMPLE_ITEM.get()));

    public static class ModItemGroup extends ItemGroup {
        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Nonnull
        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }

}
