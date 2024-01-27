package top.eopj.common.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TuJangTNTBlock extends Block {
    public TuJangTNTBlock() {
        super(FabricBlockSettings.copy(Blocks.TNT));
    }


    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        prime(world,pos,player);
        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        if (Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.eopj.tujang_tnt.introduction.1").formatted(Formatting.GOLD));
            tooltip.add(Text.translatable("tooltip.eopj.tujang_tnt.introduction.2").formatted(Formatting.RED));
        }else {
            tooltip.add(Text.translatable("tooltip.eopj.introduction"));
        }
    }

    private void prime(World world, BlockPos pos, Entity entity){
        if (!world.isClient) {
            world.removeBlock(pos, false);
            world.createExplosion(entity, pos.getX(), pos.getY(), pos.getZ(), 20.0f, true, World.ExplosionSourceType.TNT);
        }
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (world.isReceivingRedstonePower(pos)) {
            world.removeBlock(pos, false);
            world.createExplosion(new TntEntity(world,pos.getX(),pos.getY(),pos.getZ(),null),
                    pos.getX(), pos.getY(), pos.getZ(), 20.0f, true, World.ExplosionSourceType.TNT);
        }
    }
}
