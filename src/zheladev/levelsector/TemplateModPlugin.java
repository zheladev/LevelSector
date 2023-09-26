package zheladev.levelsector;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.fleet.FleetAPI;
import org.json.JSONObject;

public class TemplateModPlugin extends BaseModPlugin {
    @Override
    public void onApplicationLoad() throws Exception {
        JSONObject settings = Global.getSettings().loadJSON("levelsector.json");
        super.onApplicationLoad();

        // Test that the .jar is loaded and working, using the most obnoxious way possible.
        throw new RuntimeException("Template mod loaded! Remove this crash in TemplateModPlugin.");
    }

    @Override
    public void onNewGame() {
        super.onNewGame();


        // The code below requires that Nexerelin is added as a library (not a dependency, it's only needed to compile the mod).
//        boolean isNexerelinEnabled = Global.getSettings().getModManager().isModEnabled("nexerelin");

//        if (!isNexerelinEnabled || SectorManager.getManager().isCorvusMode()) {
//                    new MySectorGen().generate(Global.getSector());
            // Add code that creates a new star system (will only run if Nexerelin's Random (corvus) mode is disabled).
//        }
    }
}
