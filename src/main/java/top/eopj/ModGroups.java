package top.eopj;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import top.eopj.common.items.ItemRegistry;

import static top.eopj.EatOldPictireJiang.MODID;

public class ModGroups {

    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ItemRegistry.PICTURE_JAM_FOOD))
            .displayName(Text.translatable("itemGroup.eopj.main_group"))
            .build();

    private static final RegistryKey<ItemGroup> MOD_GROUPS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MODID,"main_group"));
    public static void regGroup(){
        ItemGroupEvents.modifyEntriesEvent(MOD_GROUPS).register(content -> {
            content.add(ItemRegistry.PICTURE_JAM_FOOD);
            content.add(ItemRegistry.NORS_FOOD);
            content.add(ItemRegistry.RESERVED_FOOD);
            content.add(ItemRegistry.GAME_WATER_GU);
            content.add(ItemRegistry.NORTHEAST_SHOVEL);
            content.add(ItemRegistry.TUJAM_BLOCK);
            content.add(ItemRegistry.TWISTED_TUJAM_BLOCK);
            content.add(ItemRegistry.ASTONISHED_TUJAM_BLOCK);
            content.add(ItemRegistry.FORTUNE_CAT_SPAWN_EGG);
            content.add(ItemRegistry.NOR_SPAWN_EGG);
            content.add(ItemRegistry.TU_JANG_SPAWN_EGG);
            content.add(ItemRegistry.GW_SPAWN_EGG);
        });
    }
    public static void register(){
        Registry.register(Registries.ITEM_GROUP, new Identifier(MODID, "main_group"), ITEM_GROUP);
        regGroup();
    }
}
