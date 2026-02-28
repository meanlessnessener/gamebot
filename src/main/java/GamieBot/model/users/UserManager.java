package GamieBot.model.users;

import java.util.HashMap;


public class UserManager {
    private final HashMap<String, User> users;

    public UserManager() {
        users = new HashMap<>();
    }

    public User getUser(String chatId) {
        return users.getOrDefault(chatId, null);
    }
}
