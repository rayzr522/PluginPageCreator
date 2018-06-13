package me.rayzr522.pluginpagecreator.output;

import me.rayzr522.pluginpagecreator.data.PluginData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

/**
 * @author Rayzr522
 */
public abstract class AbstractOutputStrategy implements OutputStrategy {
    private final Path outputFolder;
    private final PluginData pluginData;

    public AbstractOutputStrategy(Path outputFolder, PluginData pluginData) {
        Objects.requireNonNull(outputFolder, "outputFolder cannot be null!");
        Objects.requireNonNull(pluginData, "pluginData cannot be null!");

        this.outputFolder = outputFolder;
        this.pluginData = pluginData;
    }

    @Override
    public Path getOutputFolder() {
        return outputFolder;
    }

    @Override
    public PluginData getPluginData() {
        return pluginData;
    }

    protected Path makeFolder(String path) throws IOException {
        Path resolved = outputFolder.resolve(path);
        if (!Files.exists(resolved)) {
            Files.createDirectory(outputFolder.resolve(path));
        }
        return resolved;
    }

    protected Path makeFile(String path) throws IOException {
        Path resolved = outputFolder.resolve(path);
        if (!Files.exists(resolved)) {
            Files.createFile(outputFolder.resolve(path));
        }
        return resolved;
    }

    protected Path writeFile(String path, String data) throws IOException {
        Path file = makeFile(path);
        return Files.write(file, data.getBytes());
    }

    @Override
    public abstract void execute() throws IOException;
}
