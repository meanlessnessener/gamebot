package GamieBot.presenter.requestHandling.game;

import GamieBot.model.GameSession;
import GamieBot.model.users.UserManager;
import java.util.ArrayList;


public class SessionManager {
    private final ArrayList<GameSession> sessions;
    private final UserManager users;
    
    public SessionManager(UserManager users) {
        sessions = new ArrayList<>();
        this.users = users;
    }
}
