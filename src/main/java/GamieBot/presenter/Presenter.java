package GamieBot.presenter;

import GamieBot.view.IView;
import GamieBot.presenter.requestHandling.GeneralRequestHandler;


public class Presenter implements IEventListener{
    private final IView view;
    private final GeneralRequestHandler requestHandler;

    public Presenter(IView view) {
        this.view = view;
        this.view.setListener(this);
        this.requestHandler = new GeneralRequestHandler();
    }
    
    @Override
    public void onMessageReceived(String chatId, String text) {
        
    }
    
    public void run() {

    }
}
