package GamieBot.model.games;


public interface IGame {
    public void initGame(int firstPlayer, int secondPlayer);
    public void makeMove(int playerNum, String action);
    public String getInfoForPlayer(int playerNum);
}
