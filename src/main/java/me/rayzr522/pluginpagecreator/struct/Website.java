package me.rayzr522.pluginpagecreator.struct;

/**
 * @author Rayzr522
 */
public class Website {
    private String name;
    private String url;

    public Website(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
