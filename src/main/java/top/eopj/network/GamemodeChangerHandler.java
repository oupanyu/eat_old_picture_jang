package top.eopj.network;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.world.GameMode;

public class GamemodeChangerHandler{

    public static void run(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender) {
        int ctime = buf.getInt(0);
        GameMode originalGamemode = player.interactionManager.getGameMode();
        if (originalGamemode == GameMode.CREATIVE){
            player.sendMessageToClient(Text.translatable("eopj.message.already.creative"),false);
            return;
        }
        player.sendMessageToClient(Text.translatable("eopj.message.gamemode.creative",ctime),false);
        player.changeGameMode(GameMode.CREATIVE);
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(ctime * 1000 + 1);
                    player.changeGameMode(originalGamemode);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
