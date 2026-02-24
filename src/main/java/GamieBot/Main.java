package GamieBot;

import GamieBot.presenter.Presenter;
import GamieBot.view.IView;
import GamieBot.view.TelegramBotView;


public class Main {
    public static void main(String[] args) throws Exception {
        IView TelegramBotView = new TelegramBotView();

        Presenter presenter = new Presenter(TelegramBotView);

        presenter.run();
    }
}
