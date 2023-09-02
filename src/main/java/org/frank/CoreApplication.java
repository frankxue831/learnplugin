package org.frank;

public class CoreApplication {
    public static void main(String[] args) {
        PluginLoader pluginLoader = new PluginLoader();
        pluginLoader.loadPlugins();
        // Other core logic here
    }
}

