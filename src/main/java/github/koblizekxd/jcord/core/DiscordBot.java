package github.koblizekxd.jcord.core;

public abstract class DiscordBot {
    public abstract Settings onStartup();

    public static class Settings {
        private String token;

        public Settings token(String token) {
            this.token = token;
            return this;
        }
    }
}
