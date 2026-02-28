package GamieBot.model.games;


public class TicTacToe implements IGame {
    @Override
    public void initGame(int firstPlayer, int secondPlayer) {
        state = "=======\n| | | |\n=======\n| | | |\n=======\n| | | |\n=======";
        player1 = firstPlayer;
        player2 = secondPlayer;
        isFirstPlayerMove = true;
    }

    /*
    =======
    | | | |
    =======
    | | | |
    =======
    | | | |
    =======
    */

    @Override
    public void makeMove(int playerNum, String action) {
        if (playerNum == player1) {
            if (isFirstPlayerMove) {
                
            }
        }
    }

    @Override
    public String getInfoForPlayer(int playerNum) {

        return "aboba";
    }

    private String state;
    private int player1, player2;
    private boolean isFirstPlayerMove;
}
