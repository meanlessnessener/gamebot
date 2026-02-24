package GamieBot.presenter.requestHandling.system;

import GamieBot.model.Response;
import GamieBot.presenter.requestHandling.IRequestHandler;
import GamieBot.model.users.UserManager;
import java.util.ArrayList;


public class SystemRequestHandler implements IRequestHandler {
    private final UserManager users;

    public SystemRequestHandler(UserManager users) {
        this.users = users;
    }

    @Override
    public ArrayList<Response> handleRequest(String chatId, String text) {
        return new ArrayList<>();
    }
}
