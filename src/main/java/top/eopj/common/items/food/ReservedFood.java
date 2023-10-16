package top.eopj.common.items.food;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class ReservedFood extends Item {
    public ReservedFood(Settings settings) {
        super(settings.food(new FoodComponent.Builder()
                .alwaysEdible()
                .hunger(9)
                .build()));
    }
}
