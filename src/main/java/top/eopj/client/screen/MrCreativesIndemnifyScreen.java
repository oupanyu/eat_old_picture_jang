package top.eopj.client.screen;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextWidget;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.text.Text;
import top.eopj.init.ModNetworkConstants;
import top.eopj.screen.handler.MrCreativesIndemnifySHandler;

public class MrCreativesIndemnifyScreen extends HandledScreen<MrCreativesIndemnifySHandler> {

    ButtonWidget buttonIncrease;

    ButtonWidget buttonDecrease;

    ButtonWidget buttonConfirm;

    TextWidget textWidget;
    private int creativeSeconds = 1;

    public MrCreativesIndemnifyScreen(MrCreativesIndemnifySHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);

    }

    @Override
    protected void drawForeground(DrawContext context, int mouseX, int mouseY) {

    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }

    @Override
    protected void init() {
        super.init();
        textWidget = new TextWidget(this.x * 2 + 120, this.y * 2 - 30, Text.translatable("eopj.gui.text.creativeindemnify.time", creativeSeconds)
                , MinecraftClient.getInstance().textRenderer);
        buttonIncrease = ButtonWidget.builder(Text.translatable("eopj.widget.button.increase"), buttonI -> {
            creativeSeconds++;
            textWidget.setMessage(Text.translatable("eopj.gui.text.creativeindemnify.time", creativeSeconds));
        }).dimensions(this.x + 65, this.y + 10, 100, 20).build();

        buttonDecrease = ButtonWidget.builder(Text.translatable("eopj.widget.button.decrease"), buttonD -> {
            creativeSeconds--;
            if (creativeSeconds <= 1) {
                creativeSeconds = 1;
            }
            textWidget.setMessage(Text.translatable("eopj.gui.text.creativeindemnify.time", creativeSeconds));
        }).dimensions(this.x - 45, this.y + 10, 100, 20).build();

        buttonConfirm = ButtonWidget.builder(Text.translatable("eopj.widget.button.confirm"), buttonD -> {
            PacketByteBuf buf = PacketByteBufs.create();
            buf.writeInt(creativeSeconds);
            ClientPlayNetworking.send(ModNetworkConstants.GAMEMODE_CHANGER_PACKET, buf);
            this.close();
        }).dimensions(this.x + 10, this.y + 50, 100, 20).build();
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        this.addDrawableChild(buttonIncrease);
        this.addDrawableChild(buttonDecrease);
        this.addDrawableChild(buttonConfirm);
        this.addDrawableChild(textWidget);
    }
}
