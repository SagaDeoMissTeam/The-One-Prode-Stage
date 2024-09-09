package net.sixik.theoneprodestages.mixin;


import com.mojang.blaze3d.vertex.PoseStack;
import mcjty.theoneprobe.api.ProbeMode;
import mcjty.theoneprobe.rendering.OverlayRenderer;
import net.minecraft.client.Minecraft;
import net.sixik.theoneprodestages.TheOneProdeStages;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = OverlayRenderer.class, remap = false)
public class OverlayRendererMixin {

    @Inject(method = "renderHUD", at = @At("HEAD"), cancellable = true)
    private static void sdm$renderHUD(ProbeMode mode, PoseStack matrixStack, float partialTicks, CallbackInfo ci){
        if(TheOneProdeStages.noStage(Minecraft.getInstance().player, TheOneProdeStages.theOneProdeStage)){
            ci.cancel();
        }
    }
}
