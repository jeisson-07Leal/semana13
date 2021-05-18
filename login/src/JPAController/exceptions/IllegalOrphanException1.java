package JPAController.exceptions;

import java.util.ArrayList;
import java.util.List;

public class IllegalOrphanException1 extends Exception {
    private List<String> messages;
    public IllegalOrphanException1(List<String> messages) {
        super((messages != null && messages.size() > 0 ? messages.get(0) : null));
        if (messages == null) {
            this.messages = new ArrayList<String>();
        }
        else {
            this.messages = messages;
        }
    }
    public List<String> getMessages() {
        return messages;
    }
}
