package top.eopj.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import top.eopj.EatOldPictireJiang;

public class FortuneCat extends CatEntity {

    public static final double SPRINTING_SPEED = 1.2;
    public FortuneCat(EntityType<? extends CatEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public Identifier getTexture() {
        return new Identifier(EatOldPictireJiang.MODID, "textures/entity/fortune_cat.png");
    }
}
