package top.eopj.init;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;
import top.eopj.network.GamemodeChangerHandler;
import top.eopj.utils.ModUtils;

public class ModNetworkConstants {
    public static final Identifier GAMEMODE_CHANGER_PACKET = ModUtils.createId("gamemode_change");


    public static void register(){
        ServerPlayNetworking.registerGlobalReceiver(GAMEMODE_CHANGER_PACKET, GamemodeChangerHandler::run);
    }
}
