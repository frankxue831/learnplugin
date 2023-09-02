package org.frank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoreApplication {
    private static final Logger logger = LoggerFactory.getLogger(CoreApplication.class);
    public static void main(String[] args) {
        PluginLoader pluginLoader = new PluginLoader();
        pluginLoader.loadPlugins();
        // Other core logic here
    }
}

