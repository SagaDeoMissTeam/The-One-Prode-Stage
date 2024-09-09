package net.sixik.theoneprodestages.addons;

import com.blamejared.crafttweaker.api.actions.IRuntimeAction;
import net.sixik.theoneprodestages.TheOneProdeStages;

public class ProdeStageAction implements IRuntimeAction {

    public final String stage;

    public ProdeStageAction(String stage) {
        this.stage = stage;
    }

    @Override
    public void apply() {
        TheOneProdeStages.theOneProdeStage = stage;
    }

    @Override
    public String describe() {
        return "Restricted The One Prode on " + stage + ".stage";
    }
}
