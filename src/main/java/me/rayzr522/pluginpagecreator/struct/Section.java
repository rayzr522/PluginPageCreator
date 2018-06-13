package me.rayzr522.pluginpagecreator.struct;

/**
 * @author Rayzr522
 */
public class Section {
    private String title;
    private String body;

    public Section(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Section{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
