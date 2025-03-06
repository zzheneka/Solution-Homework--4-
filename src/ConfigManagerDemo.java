public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Вывод конфигурационных данных
        configManager.printConfigurations();

        // Получение отдельных настроек
        System.out.println("Max Players: " + configManager.getConfig("maxPlayers"));
        System.out.println("Default Language: " + configManager.getConfig("defaultLanguage"));
    }
}
