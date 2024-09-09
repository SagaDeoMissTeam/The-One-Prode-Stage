package net.sixik.theoneprodestages.addons;


import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Name("mods.topstages.TOPStages")
public class CraftTweaker {

    @ZenCodeType.Method
    public static void setStage(String stage){
        CraftTweakerAPI.apply(new ProdeStageAction(stage));
    }
}
