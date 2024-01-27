package top.eopj.common.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.ai.goal.GoalSelector;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import top.eopj.mixin.entity.MobEntityMixin;

import java.util.List;

public class NorthEastShovel extends ShovelItem {
    public NorthEastShovel(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity player && target.isAlive() && target instanceof MobEntity monster
                && target.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE) != null
             && !(target instanceof TameableEntity) ){
            GoalSelector targetSelector = ((MobEntityMixin)monster).getTargetSelector();
            targetSelector.add(0,new ActiveTargetGoal<>(monster, MobEntity.class,false));

        }
        return false;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.eopj.northeast_shovel.introduction.1").formatted(Formatting.GOLD));
        }else {
            tooltip.add(Text.translatable("tooltip.eopj.introduction"));
        }
    }
}
