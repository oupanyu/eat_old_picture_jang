package top.eopj.init;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;
import top.eopj.common.entity.TuJangEntity;

public class ModEntitiesSpawn {
    public static void addEntitySpawn(){
        BiomeModifications.addSpawn(
                BiomeSelectors.excludeByKey(BiomeKeys.PLAINS
                ),
                SpawnGroup.CREATURE,ModEntities.TU_JANG_ENTITY_TYPE,10,4,10);

        SpawnRestriction.register(ModEntities.TU_JANG_ENTITY_TYPE, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,TuJangEntity::canMobSpawn);

        BiomeModifications.addSpawn(
                BiomeSelectors.excludeByKey(BiomeKeys.PLAINS
                ),
                SpawnGroup.CREATURE,ModEntities.NOR_ENTITY_TYPE,10,4,10);

        SpawnRestriction.register(ModEntities.NOR_ENTITY_TYPE, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,TuJangEntity::canMobSpawn);

        BiomeModifications.addSpawn(
                BiomeSelectors.excludeByKey(BiomeKeys.PLAINS
                ),
                SpawnGroup.CREATURE,ModEntities.GW_ENTITY_TYPE,10,4,10);

        SpawnRestriction.register(ModEntities.GW_ENTITY_TYPE, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,TuJangEntity::canMobSpawn);
    }
}
