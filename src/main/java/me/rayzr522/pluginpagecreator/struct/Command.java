package me.rayzr522.pluginpagecreator.struct;

import java.util.Set;

/**
 * @author Rayzr522
 */
public class Command {
    private String name;
    private String usage;
    private String description;
    private Set<String> requiredPermissions;

    public Command(String name, String usage, String description, Set<String> requiredPermissions) {
        this.name = name;
        this.usage = usage;
        this.description = description;
        this.requiredPermissions = requiredPermissions;
    }

    public String getName() {
        return name;
    }

    public String getUsage() {
        return usage;
    }

    public String getDescription() {
        return description;
    }

    public Set<String> getRequiredPermissions() {
        return requiredPermissions;
    }

    @Override
    public String toString() {
        return "Command{" +
                "name='" + name + '\'' +
                ", usage='" + usage + '\'' +
                ", description='" + description + '\'' +
                ", requiredPermissions=" + requiredPermissions +
                '}';
    }
}
