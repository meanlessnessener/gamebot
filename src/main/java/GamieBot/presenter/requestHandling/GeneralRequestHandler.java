package GamieBot.presenter.requestHandling;

import GamieBot.presenter.requestHandling.game.GameRequestHandler;
import GamieBot.presenter.requestHandling.system.SystemRequestHandler;
import GamieBot.model.Response;
import GamieBot.model.users.UserManager;
import java.util.ArrayList;


public class GeneralRequestHandler implements IRequestHandler {
    private final GameRequestHandler gameRequestHandler;
    private final SystemRequestHandler systemRequestHandler;
    private final UserManager users;

    public GeneralRequestHandler() {
        users = new UserManager();
        gameRequestHandler = new GameRequestHandler(users);
        systemRequestHandler = new SystemRequestHandler(users);
    }

    @Override
    public ArrayList<Response> handleRequest(String chatId, String text) {
        return new ArrayList<>();
    }
}
