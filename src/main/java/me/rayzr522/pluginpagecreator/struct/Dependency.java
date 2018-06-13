package me.rayzr522.pluginpagecreator.struct;

import java.util.Optional;

/**
 * @author Rayzr522
 */
public class Dependency {
    private String name;
    private String url;
    private String minVersion;

    public Dependency(String name, String url, String minVersion) {
        this.name = name;
        this.url = url;
        this.minVersion = minVersion;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public Optional<String> getMinVersion() {
        return Optional.ofNullable(minVersion);
    }

    @Override
    public String toString() {
        return "Dependency{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", minVersion='" + minVersion + '\'' +
                '}';
    }
}
