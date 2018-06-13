package me.rayzr522.pluginpagecreator.data;

import me.rayzr522.pluginpagecreator.struct.Command;
import me.rayzr522.pluginpagecreator.struct.GitHubRepository;
import me.rayzr522.pluginpagecreator.struct.Permission;
import me.rayzr522.pluginpagecreator.struct.Website;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

/**
 * @author Rayzr522
 */
public class PluginData {
    private String name;
    private String description;
    private GitHubRepository gitHubRepository;
    private Set<Website> websites = Collections.emptySet();
    private Set<Command> commands = Collections.emptySet();
    private Set<Permission> permissions = Collections.emptySet();

    public PluginData(String name, String description, GitHubRepository gitHubRepository, Set<Website> websites, Set<Command> commands, Set<Permission> permissions) {
        this.name = name;
        this.description = description;
        this.gitHubRepository = gitHubRepository;
        this.websites = websites;
        this.commands = commands;
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Optional<GitHubRepository> getGitHubRepository() {
        return Optional.ofNullable(gitHubRepository);
    }

    public Set<Website> getWebsites() {
        return websites;
    }

    public Set<Command> getCommands() {
        return commands;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    @Override
    public String toString() {
        return "PluginData{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", websites='" + websites + '\'' +
                ", gitHubRepository=" + gitHubRepository +
                ", commands=" + commands +
                ", permissions=" + permissions +
                '}';
    }
}
