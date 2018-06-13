package me.rayzr522.pluginpagecreator.output;

import me.rayzr522.pluginpagecreator.data.PluginData;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author Rayzr522
 */
public interface OutputStrategy {
    Path getOutputFolder();

    PluginData getPluginData();

    void execute() throws IOException;
}
