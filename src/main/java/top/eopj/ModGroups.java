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

import static top.eopj.EatOldPictireJiang.MODID;

public class ModGroups {

    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.PICTURE_JAM_FOOD))
            .displayName(Text.translatable("itemGroup.eopj.main_group"))
            .build();

    private static final RegistryKey<ItemGroup> MOD_GROUPS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MODID,"main_group"));
    public static void regGroup(){
        ItemGroupEvents.modifyEntriesEvent(MOD_GROUPS).register(content -> {
            content.add(ModItems.PICTURE_JAM_FOOD);
            content.add(ModItems.NORS_FOOD);
            content.add(ModItems.RESERVED_FOOD);
            content.add(ModItems.GAME_WATER_GU);
            content.add(ModItems.CREATIVE_INDEMNIFY);
            content.add(ModItems.NORTHEAST_SHOVEL);
            content.add(ModItems.TUJANG_ORE);
            content.add(ModItems.TUJAM_BLOCK);
            content.add(ModItems.TWISTED_TUJAM_BLOCK);
            content.add(ModItems.ASTONISHED_TUJAM_BLOCK);
            content.add(ModItems.TUJANG_TNT);
            content.add(ModItems.TUJANG_ITEM);
            content.add(ModItems.FORTUNE_CAT_SPAWN_EGG);
            content.add(ModItems.NOR_SPAWN_EGG);
            content.add(ModItems.TU_JANG_SPAWN_EGG);
            content.add(ModItems.GW_SPAWN_EGG);
        });
    }
    public static void register(){
        Registry.register(Registries.ITEM_GROUP, new Identifier(MODID, "main_group"), ITEM_GROUP);
        regGroup();
    }
}
