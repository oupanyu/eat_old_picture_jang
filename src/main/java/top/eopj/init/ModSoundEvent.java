package top.eopj.init;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import top.eopj.utils.ModUtils;

public class ModSoundEvent {

    //Identifiers
    public static final Identifier ID_MOB_TUJANG_SAYING = ModUtils.createId("tujang_ambient");
    public static final Identifier ID_MOB_TUJANG_DEATH = ModUtils.createId("tujang_death");
    public static final Identifier ID_MOB_NOR_ATTACK_TUJANG = ModUtils.createId("nor_attack_tu");



    //SoundEvents
    public static final SoundEvent MOB_TUJANG_SAYING = SoundEvent.of(ID_MOB_TUJANG_SAYING,16.0f);
    public static final SoundEvent MOB_TUJANG_DEATH = SoundEvent.of(ID_MOB_TUJANG_DEATH,16.0f);
    public static final SoundEvent MOB_NOR_ATTACK_TUJANG = SoundEvent.of(ID_MOB_NOR_ATTACK_TUJANG,16.0f);


    public static void register(){
        Registry.register(Registries.SOUND_EVENT,ID_MOB_TUJANG_SAYING,MOB_TUJANG_SAYING);
        Registry.register(Registries.SOUND_EVENT,ID_MOB_TUJANG_DEATH,MOB_TUJANG_DEATH);
        Registry.register(Registries.SOUND_EVENT,ID_MOB_NOR_ATTACK_TUJANG,MOB_NOR_ATTACK_TUJANG);

    }
}
