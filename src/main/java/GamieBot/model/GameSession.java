package GamieBot.model;

import GamieBot.model.games.IGame;
import GamieBot.model.users.User;

import java.util.ArrayList;


public class GameSession {
    private final IGame game;
    private final ArrayList<User> users;

    public GameSession(IGame game, ArrayList<User> users) {
        this.game = game;
        this.users = users;
    }

    public void makeMove(String chatId, String action) {

    }

    public ArrayList<Response> getInfoForPlayers() {
        return new ArrayList<>();
    }
}
