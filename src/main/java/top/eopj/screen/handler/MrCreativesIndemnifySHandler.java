package top.eopj.screen.handler;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import top.eopj.init.ModScreenHandler;

public class MrCreativesIndemnifySHandler extends ScreenHandler {


    public PlayerInventory inventory;


    public MrCreativesIndemnifySHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId,playerInventory,1);
    }
    public MrCreativesIndemnifySHandler(int syncId,PlayerInventory inventory,int a) {
        super(ModScreenHandler.MR_CREATIVES_INDEMNIFY_S_HANDLER_SCREEN_HANDLER_TYPE, syncId);
    }

    @Override
    public boolean onButtonClick(PlayerEntity player, int id) {
        return super.onButtonClick(player, id);
    }



    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot2 = (Slot)this.slots.get(slot);
        if (slot2 != null && slot2.hasStack()) {
            ItemStack itemStack2 = slot2.getStack();
            itemStack = itemStack2.copy();
            if (slot == 0) {
                if (!this.insertItem(itemStack2, 10, 36, true)) {
                    return ItemStack.EMPTY;
                }
                slot2.onQuickTransfer(itemStack2, itemStack);
            } else if (slot >= 10 && slot < 46 ? !this.insertItem(itemStack2, 1, 10, false) && (slot < 37 ? !this.insertItem(itemStack2, 28, 37, false) : !this.insertItem(itemStack2, 10, 37, false)) : !this.insertItem(itemStack2, 10, 46, false)) {
                return ItemStack.EMPTY;
            }
            if (itemStack2.isEmpty()) {
                slot2.setStack(ItemStack.EMPTY);
            } else {
                slot2.markDirty();
            }
            if (itemStack2.getCount() == itemStack.getCount()) {
                return ItemStack.EMPTY;
            }
            slot2.onTakeItem(player, itemStack2);
            if (slot == 0) {
                player.dropItem(itemStack2, false);
            }
        }
        return itemStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }
}
