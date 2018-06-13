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
    private Set<Dependency> dependencies = Collections.emptySet();
    private Set<Section> sections = Collections.emptySet();

    public PluginData(String name, String blurb, String description, GitHubRepository gitHubRepository) {
        this.name = name;
        this.blurb = blurb;
        this.description = description;
        this.gitHubRepository = gitHubRepository;
        this.websites = websites;
        this.commands = commands;
        this.permissions = permissions;
        this.sections = sections;
        this.dependencies = dependencies;
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

    public void setWebsites(Set<Website> websites) {
        this.websites = websites;
    }

    public void addWebsite(Website website) {
        websites.add(website);
    }

    public Set<Command> getCommands() {
        return commands;
    }

    public void setCommands(Set<Command> commands) {
        this.commands = commands;
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public void addPermission(Permission permission) {
        permissions.add(permission);
    }

    public Set<Section> getSections() {
        return sections;
    }

    public void setSections(Set<Section> sections) {
        this.sections = sections;
    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public void setDependencies(Set<Dependency> dependencies) {
        this.dependencies = dependencies;
    }

    public void addDependency(Dependency dependency) {
        dependencies.add(dependency);
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
