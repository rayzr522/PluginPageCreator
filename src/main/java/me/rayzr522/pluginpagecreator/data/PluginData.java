package me.rayzr522.pluginpagecreator.data;

import me.rayzr522.pluginpagecreator.struct.*;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

/**
 * @author Rayzr522
 */
public class PluginData {
    private String name;
    private String blurb;
    private String description;
    private GitHubRepository gitHubRepository;
    private Set<Website> websites = Collections.emptySet();
    private Set<Command> commands = Collections.emptySet();
    private Set<Permission> permissions = Collections.emptySet();
    private Set<Section> sections = Collections.emptySet();

    public PluginData(String name, String blurb, String description, GitHubRepository gitHubRepository, Set<Website> websites, Set<Command> commands, Set<Permission> permissions, Set<Section> sections) {
        this.name = name;
        this.blurb = blurb;
        this.description = description;
        this.gitHubRepository = gitHubRepository;
        this.websites = websites;
        this.commands = commands;
        this.permissions = permissions;
        this.sections = sections;
    }

    public String getName() {
        return name;
    }

    public String getBlurb() {
        return blurb;
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

    public Set<Section> getSections() {
        return sections;
    }

    @Override
    public String toString() {
        return "PluginData{" +
                "name='" + name + '\'' +
                ", blurb='" + blurb + '\'' +
                ", description='" + description + '\'' +
                ", websites='" + websites + '\'' +
                ", gitHubRepository=" + gitHubRepository +
                ", commands=" + commands +
                ", permissions=" + permissions +
                ", sections=" + sections +
                '}';
    }
}
