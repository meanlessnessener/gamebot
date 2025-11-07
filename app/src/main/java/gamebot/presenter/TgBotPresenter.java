package gamebot.presenter;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import io.github.cdimascio.dotenv.Dotenv;

public class TgBotPresenter extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "gamebot";
    }

    @Override
    public String getBotToken() {
        return Dotenv.configure()
                    .directory("../")
                    .load()
                    .get("BOT_TOKEN");
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String text = update.getMessage().getText();
            SendMessage msg = new SendMessage(update.getMessage().getChatId().toString(), "Ты написал: " + text);

            try {
                execute(msg);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}
