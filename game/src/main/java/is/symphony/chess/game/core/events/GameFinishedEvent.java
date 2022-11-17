package is.symphony.chess.game.core.events;

import java.util.UUID;

public class GameFinishedEvent {

    private UUID gameId;

    private String result;

    private UUID whitePlayer;

    private UUID blackPlayer;

    public GameFinishedEvent() { }

    public GameFinishedEvent(final UUID gameId, final String result, final UUID whitePlayer, final UUID blackPlayer) {
        this.gameId = gameId;
        this.result = result;
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
    }

    public UUID getGameId() {
        return gameId;
    }

    public void setGameId(final UUID gameId) {
        this.gameId = gameId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(final String result) {
        this.result = result;
    }

    public UUID getWhitePlayer() {
        return whitePlayer;
    }

    public void setWhitePlayer(final UUID whitePlayer) {
        this.whitePlayer = whitePlayer;
    }

    public UUID getBlackPlayer() {
        return blackPlayer;
    }

    public void setBlackPlayer(final UUID blackPlayer) {
        this.blackPlayer = blackPlayer;
    }
}
