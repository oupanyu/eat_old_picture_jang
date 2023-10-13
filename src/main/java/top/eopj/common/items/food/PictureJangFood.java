package top.eopj.common.items.food;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;

public class PictureJangFood extends Item {
    public PictureJangFood(Settings settings) {
        super(settings.food(new FoodComponent.Builder()
                .alwaysEdible()
                .hunger(10)
                .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1145, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1145, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,1145,1),1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,1145,1),1.0f)
                .build()));
    }
}
