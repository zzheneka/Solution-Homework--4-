package СonfigManager;

public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.printConfigurations();
        System.out.println("Max Players: " + configManager.getConfig("maxPlayers"));
        System.out.println("Default Language: " + configManager.getConfig("defaultLanguage"));
    }
}
