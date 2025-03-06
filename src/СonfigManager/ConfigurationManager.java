package СonfigManager;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private final Map<String, String> configSettings;


    private ConfigurationManager() {
        configSettings = new HashMap<>();
        loadConfigurations();
    }
    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }




    private void loadConfigurations() {
        configSettings.put("maxPlayers", "100");
        configSettings.put("defaultLanguage", "en");
        configSettings.put("gameDifficulty", "medium");
    }

    public String getConfig(String key) {
        return configSettings.getOrDefault(key, "Key not found");
    }


    public void printConfigurations() {
        System.out.println("Configuration Settings:");
        for (Map.Entry<String, String> entry : configSettings.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
