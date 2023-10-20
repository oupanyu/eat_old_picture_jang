package top.eopj;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.IllagerEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import top.eopj.common.entity.*;

import static top.eopj.EatOldPictireJiang.MODID;

public class ModEntities {
    public static final EntityType<FortuneCat> FORTUNE_CAT_ENTITY_TYPE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MODID, "fortune_cat"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FortuneCat::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

    public static final EntityType<TuJangEntity> TU_JANG_ENTITY_TYPE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MODID, "tu_jang"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TuJangEntity::new).dimensions(EntityDimensions.fixed(1f, 2f)).build()
    );



    public static final EntityType<NorEntity> NOR_ENTITY_TYPE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MODID, "nor"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, NorEntity::new).dimensions(EntityDimensions.fixed(1f, 2f)).build()
    );

    public static final EntityType<GameWaterEntity> GW_ENTITY_TYPE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MODID, "game_water"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GameWaterEntity::new).dimensions(EntityDimensions.fixed(1f, 2f)).build()
    );


    public static void register(){
        FabricDefaultAttributeRegistry.register(FORTUNE_CAT_ENTITY_TYPE, FortuneCat.createMobAttributes()
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.3f)
                .add(EntityAttributes.GENERIC_MAX_HEALTH,7)
                .add(EntityAttributes.GENERIC_ARMOR,1)
                .build());

        FabricDefaultAttributeRegistry.register(TU_JANG_ENTITY_TYPE, TuJangEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH,20)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.3)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,2)
                .build());

        FabricDefaultAttributeRegistry.register(GW_ENTITY_TYPE, TuJangEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH,20)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.3)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,2)
                .build());

        FabricDefaultAttributeRegistry.register(NOR_ENTITY_TYPE, TuJangEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH,20)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,20)
                        .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.3)
                .add(EntityAttributes.GENERIC_ARMOR,3)
                .build());
        
    }
}
