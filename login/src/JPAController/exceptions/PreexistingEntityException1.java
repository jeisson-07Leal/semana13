package JPAController.exceptions;

public class PreexistingEntityException1 extends Exception {
    public PreexistingEntityException1(String message, Throwable cause) {
        super(message, cause);
    }
    public PreexistingEntityException1(String message) {
        super(message);
    }
}
