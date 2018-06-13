package me.rayzr522.pluginpagecreator.struct;

import java.util.Objects;

/**
 * @author Rayzr522
 */
public class GitHubRepository {
    private static final String BASE = "https://github.com";
    private static final String REPO_URL = BASE + "/%s/%s";
    private static final String ISSUES_URL = REPO_URL + "/issues";

    private final String user;
    private final String name;

    public GitHubRepository(String user, String name) {
        this.user = user;
        this.name = name;
    }

    public static GitHubRepository parse(String input) {
        Objects.requireNonNull(input, "input cannot be null!");

        String data = input;

        if (data.startsWith(BASE + "/")) {
            data = data.substring(BASE.length() + 1);
        }

        if (data.matches("\\w+/\\w+")) {
            String[] split = data.split("/");
            String user = split[0];
            String name = split[1];
            if (name.endsWith(".git")) {
                name = name.substring(0, name.length() - 4);
            }
            return new GitHubRepository(user, name);
        } else {
            throw new IllegalArgumentException(String.format("Invalid GitHub repository '%s'!", input));
        }
    }

    public String getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public String getURL() {
        return String.format(REPO_URL, user, name);
    }

    public String getIssuesURL() {
        return String.format(ISSUES_URL, user, name);
    }
}
