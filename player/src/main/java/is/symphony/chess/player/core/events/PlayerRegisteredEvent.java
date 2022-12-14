package is.symphony.chess.player.core.events;

import java.util.UUID;

public class PlayerRegisteredEvent {

    private UUID playerId;

    private String name;

    private String email;

    private boolean bot;

    private Integer level;

    private Integer rating;

    public PlayerRegisteredEvent() { }

    public PlayerRegisteredEvent(final UUID playerId, final String name, final String email, final boolean bot, final Integer level, final Integer rating) {
        this.playerId = playerId;
        this.name = name;
        this.email = email;
        this.bot = bot;
        this.level = level;
        this.rating = rating;
    }

    public UUID getPlayerId() {
        return playerId;
    }

    public void setPlayerId(final UUID playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public boolean isBot() {
        return bot;
    }

    public void setBot(final boolean bot) {
        this.bot = bot;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(final Integer level) {
        this.level = level;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(final Integer rating) {
        this.rating = rating;
    }
}
