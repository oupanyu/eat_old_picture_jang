package top.eopj.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.world.World;

public class FortuneCat extends CatEntity {
    public FortuneCat(EntityType<? extends CatEntity> entityType, World world) {
        super(entityType, world);
    }
}
