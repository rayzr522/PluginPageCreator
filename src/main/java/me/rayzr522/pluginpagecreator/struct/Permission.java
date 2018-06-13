package me.rayzr522.pluginpagecreator.struct;

import java.util.Optional;

/**
 * @author Rayzr522
 */
public class Permission {
    private String value;
    private String description;

    public Permission(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    @Override
    public String toString() {
        return "Permission{" +
                "value='" + value + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
