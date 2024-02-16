package top.eopj.common.items.food;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class GameWaterGu extends Item {

    public GameWaterGu(Settings settings) {
        super(settings.food(new FoodComponent.Builder()
                .hunger(7)
                .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 50, 1), 1.0f)
                .build()));
    }

}
