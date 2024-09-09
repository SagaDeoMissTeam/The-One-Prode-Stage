package net.sixik.theoneprodestages;

import net.darkhax.gamestages.GameStageHelper;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("theoneprodestages")
public class TheOneProdeStages {
    public static String theOneProdeStage = "";

    public TheOneProdeStages() {

    }

    public static boolean noStage(Player entity, String stage){
        return !stage.isEmpty() && !GameStageHelper.hasStage(entity, stage);
    }
}
