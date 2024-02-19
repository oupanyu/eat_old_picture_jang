package top.eopj.init;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import top.eopj.common.entity.FortuneCat;
import top.eopj.common.entity.GameWaterEntity;
import top.eopj.common.entity.NorEntity;
import top.eopj.common.entity.TuJangEntity;

import static top.eopj.EatOldPictireJiang.MODID;

public class ModEntities {
    public static final EntityType<FortuneCat> FORTUNE_CAT_ENTITY_TYPE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MODID, "fortune_cat"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FortuneCat::new).trackRangeBlocks(16).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

    public static final EntityType<TuJangEntity> TU_JANG_ENTITY_TYPE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MODID, "tu_jang"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TuJangEntity::new).trackRangeBlocks(16).dimensions(EntityDimensions.fixed(1f, 1.8f)).build()
    );



    public static final EntityType<NorEntity> NOR_ENTITY_TYPE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MODID, "nor"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, NorEntity::new).trackRangeBlocks(16).dimensions(EntityDimensions.fixed(1f, 1.8f)).build()
    );

    public static final EntityType<GameWaterEntity> GW_ENTITY_TYPE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MODID, "game_water"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GameWaterEntity::new).trackRangeBlocks(16).dimensions(EntityDimensions.fixed(1f, 1.8f)).build()
    );


    public static void register(){
        provideStandardAttribute(FORTUNE_CAT_ENTITY_TYPE,10,1,0.3,1);

        provideStandardAttribute(TU_JANG_ENTITY_TYPE,20,4,0.3,0);
        provideStandardAttribute(GW_ENTITY_TYPE,20,2,0.35,0);
        provideStandardAttribute(NOR_ENTITY_TYPE,20,15,0.35,0);
        
    }

    private static void provideStandardAttribute(EntityType<? extends MobEntity> type, double health, double attackDamage, double speed, double armor){
        FabricDefaultAttributeRegistry.register(type, MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH,health)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,attackDamage)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,speed)
                .add(EntityAttributes.GENERIC_ARMOR,armor)
                .build());
    }
}
