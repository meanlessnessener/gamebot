package GamieBot.model.games;


public interface IGame {
    public void run();
    public void makeMove(int playerNum, String action);
    public String getInfoForPlayer(int playerNum);
}
