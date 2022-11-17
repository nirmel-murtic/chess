package is.symphony.chess.game.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BoardIsNotReadyException extends ResponseStatusException {
    public BoardIsNotReadyException() {
        super(HttpStatus.CONFLICT, "Board is not ready.");
    }
}