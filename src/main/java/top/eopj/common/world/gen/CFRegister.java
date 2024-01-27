package top.eopj.common.world.gen;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.feature.PlacedFeature;
import top.eopj.utils.ModUtils;

public class CFRegister {
    public static final RegistryKey<PlacedFeature> TUJANG_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, ModUtils.createId("ore_tujang"));

    public static void register(){

    }
}
