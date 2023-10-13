package top.eopj.common.items.food;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class NorsFood extends Item {
    public NorsFood(Settings settings) {
        super(settings.food(new FoodComponent.Builder()
                .alwaysEdible()
                .hunger(9)
                .build()));
    }
}
