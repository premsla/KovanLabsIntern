package com.kovanLabs.intern.Singleton;

class AppConfig {
    private static AppConfig instance;
    private AppConfig() {
        System.out.println("AppConfig instance created!");
    }
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();  // Lazy initialization
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Singleton AppConfig is running.");
    }
}
public class Main {
    public static void main(String[] args) {
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();
        System.out.println(config1 == config2);
        config1.showMessage();
        config2.showMessage();
    }
}
