package GamieBot.view;

import GamieBot.presenter.IEventListener;


public class TelegramBotView implements IView {
    private IEventListener listener;

    @Override
    public void setListener(IEventListener listener) {
        this.listener = listener;
    }

    @Override
    public void sendMessage(String chatId, String text) {
        
    }
}
