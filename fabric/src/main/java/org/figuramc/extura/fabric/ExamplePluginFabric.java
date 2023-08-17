package org.figuramc.extura.fabric;

import net.fabricmc.api.ModInitializer;
import org.figuramc.extura.ExamplePlugin;

/**
 * A mod class is not technically needed for Fabric to load the Plugin, but it's still nice to have.
 */
public class ExamplePluginFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExamplePlugin.init();
    }
}
