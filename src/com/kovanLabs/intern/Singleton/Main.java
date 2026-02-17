package com.kovanLabs.intern.Singleton;

class AppConfig {
    private static volatile AppConfig instance;

    private AppConfig() {
        System.out.println("AppConfig instance created!");
    }

    public static AppConfig getInstance() {
        AppConfig result = instance;
        if (result == null) {
            synchronized (AppConfig.class) {
                result = instance;
                if (result == null) {
                    result = new AppConfig();  // Lazy initialization with thread safety
                    instance = result;
                }
            }
        }
        return result;
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
