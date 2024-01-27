package top.eopj.common.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import top.eopj.screen.handler.MrCreativesIndemnifySHandler;

public class MrCreativesIndemnify extends Item {
    public static Text TITLE = Text.translatable("eopj.gui.c");
    public MrCreativesIndemnify() {
        super(new FabricItemSettings());
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        NamedScreenHandlerFactory factory = new SimpleNamedScreenHandlerFactory((syncId, inventory, user) -> new MrCreativesIndemnifySHandler(syncId, inventory), TITLE);
        player.openHandledScreen(factory);
        return TypedActionResult.pass(player.getStackInHand(hand));
    }

}
