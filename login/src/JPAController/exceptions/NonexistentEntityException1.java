package JPAController.exceptions;

public class NonexistentEntityException1 extends Exception {
    public NonexistentEntityException1(String message, Throwable cause) {
        super(message, cause);
    }
    public NonexistentEntityException1(String message) {
        super(message);
    }
}
