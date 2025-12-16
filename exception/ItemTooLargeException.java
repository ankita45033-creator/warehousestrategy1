package warehouse.exception;

public class ItemTooLargeException extends Exception {
    public ItemTooLargeException(String message) {
        super(message);
    }
}
