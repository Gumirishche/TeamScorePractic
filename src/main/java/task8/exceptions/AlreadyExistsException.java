package task8.exceptions;

public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(String message, int position) {
        super(message + "\n Под номером: " + position);
    }
}

