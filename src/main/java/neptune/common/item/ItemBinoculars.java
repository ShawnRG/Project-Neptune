package neptune.common.item;

import neptune.init.ModItemGroups;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

/**
 * @author ShawnRG
 */
public class ItemBinoculars extends Item {
    private boolean inUse = false;
    private static final Logger LOGGER = LogManager.getLogger();


    public ItemBinoculars() {
        super(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
    }

    @Nonnull
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, @Nonnull Hand handIn) {
        if (worldIn.isRemote) return super.onItemRightClick(worldIn, playerIn, handIn);
        ItemStack heldItem = playerIn.getHeldItem(handIn);
        ((ItemBinoculars) heldItem.getItem()).switchInUse();
        return new ActionResult<>(ActionResultType.SUCCESS, heldItem);
    }

    public void switchInUse() {
        this.inUse = !inUse;
    }

    public boolean isInUse() {
        return inUse;
    }
}
