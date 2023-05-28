package github.koblizekxd.jcord.core.settings;

import github.koblizekxd.jcord.core.DiscordBot;

public final class SettingsFetcher {
    private final DiscordBot.Settings settings;

    public SettingsFetcher(DiscordBot.Settings settings) {
        this.settings = settings;
    }
    public DiscordBot.Settings getSettings() {
        return settings;
    }
}
