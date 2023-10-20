package top.eopj;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import top.eopj.common.entity.TuJangEntity;

public class ModEntitiesSpawn {
    public static void addEntitySpawn(){
        BiomeModifications.addSpawn(
                BiomeSelectors.excludeByKey(BiomeKeys.PLAINS,BiomeKeys.JUNGLE,BiomeKeys.BEACH,BiomeKeys.CHERRY_GROVE
                ),
                SpawnGroup.CREATURE,ModEntities.TU_JANG_ENTITY_TYPE,10,4,10);

        SpawnRestriction.register(ModEntities.TU_JANG_ENTITY_TYPE, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,TuJangEntity::canMobSpawn);

        BiomeModifications.addSpawn(
                BiomeSelectors.excludeByKey(BiomeKeys.PLAINS,BiomeKeys.JUNGLE,BiomeKeys.BEACH,BiomeKeys.CHERRY_GROVE
                ),
                SpawnGroup.CREATURE,ModEntities.NOR_ENTITY_TYPE,10,4,10);

        SpawnRestriction.register(ModEntities.NOR_ENTITY_TYPE, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,TuJangEntity::canMobSpawn);

        BiomeModifications.addSpawn(
                BiomeSelectors.excludeByKey(BiomeKeys.PLAINS,BiomeKeys.JUNGLE,BiomeKeys.BEACH,BiomeKeys.CHERRY_GROVE
                ),
                SpawnGroup.CREATURE,ModEntities.GW_ENTITY_TYPE,10,4,10);

        SpawnRestriction.register(ModEntities.GW_ENTITY_TYPE, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,TuJangEntity::canMobSpawn);
    }
}
