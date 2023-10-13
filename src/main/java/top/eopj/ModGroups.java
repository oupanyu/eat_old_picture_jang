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
            .icon(() -> new ItemStack(ItemRegistry.pictureJamFood))
            .displayName(Text.translatable("itemGroup.eopj.main_group"))
            .build();

    private static final RegistryKey<ItemGroup> MOD_GROUPS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MODID,"main_group"));
    public static void regGroup(){
        ItemGroupEvents.modifyEntriesEvent(MOD_GROUPS).register(content -> {
            content.add(ItemRegistry.pictureJamFood);
        });
    }
    public static void register(){
        Registry.register(Registries.ITEM_GROUP, new Identifier(MODID, "main_group"), ITEM_GROUP);
        regGroup();
    }
}
