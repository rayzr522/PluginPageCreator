package me.rayzr522.pluginpagecreator.output.github;

import me.rayzr522.pluginpagecreator.data.PluginData;
import me.rayzr522.pluginpagecreator.output.AbstractOutputStrategy;

import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Collectors;

/**
 * @author Rayzr522
 */
public class GitHubOutputStrategy extends AbstractOutputStrategy {

    public GitHubOutputStrategy(Path outputFolder, PluginData pluginData) {
        super(outputFolder, pluginData);
    }

    public void execute() throws IOException {
        PluginData pluginData = getPluginData();
        StringBuilder output = new StringBuilder();

        // Title
        output.append("# ").append(pluginData.getName()).append("\n\n");
        // Short description (blurb)
        output.append("> ").append(pluginData.getBlurb()).append("\n\n");
        // Description
        output.append(pluginData.getDescription()).append("\n\n");

        output.append("## Commands\n\n");
        writeCommands(output);
        output.append("## Permissions\n\n");
        writePermissions(output);

        output.append("## Installation\n\n");
        output.append("To install this plugin, just grab the latest version from any of the following websites: ");
        output.append(
                pluginData.getWebsites().stream()
                        .map(website -> String.format("[%s](%s)", website.getName(), website.getUrl()))
                        .collect(Collectors.joining(", "))
        );
    }

    private void writeCommands(StringBuilder output) {
        if (getPluginData().getCommands().size() < 1) {
            return;
        }

        getPluginData().getCommands().forEach(command -> {
            output.append("### `/").append(command.getName()).append("`\n\n");

            output.append("**Usage:** `").append(command.getUsage()).append("`\n\n");

            if (command.getRequiredPermissions().size() > 0) {
                output.append("**Required permissions:** ");
                output.append(
                        command.getRequiredPermissions().stream()
                                .map(permission -> String.format("`%s`", permission))
                                .collect(Collectors.joining(", "))
                );
                output.append("\n\n");
            }

            output.append("> ").append(command.getDescription()).append("\n\n");
        });
    }

    private void writePermissions(StringBuilder output) {
        if (getPluginData().getPermissions().size() < 1) {
            return;
        }

        getPluginData().getPermissions().forEach(permission -> {
            output.append("### `").append(permission.getValue()).append("`\n\n");
            permission.getDescription().ifPresent(description -> output.append("> ").append(description).append("\n\n"));
        });
    }
}
