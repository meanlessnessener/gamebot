package GamieBot.presenter.requestHandling;

import GamieBot.model.Response;
import java.util.ArrayList;


public interface IRequestHandler {
    public ArrayList<Response> handleRequest(String chatId, String text);
}
