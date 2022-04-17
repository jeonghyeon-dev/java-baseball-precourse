package baseball.controller;

public class GameManager {

    public static final int EXECUTION_STATUS = 1;
    public static final int END_STATUS = 2;
    private OneInning oneInning;
    private static int gameStatus;

    public GameManager() {
        setGameStatus(EXECUTION_STATUS);
    }

    public static int getGameStatus() {
        return gameStatus;
    }

    public static void setGameStatus(int deltaGametatus) {
        gameStatus = deltaGametatus;
    }

    public void execution(){

        while(gameStatus == EXECUTION_STATUS){
            oneInning = new OneInning();
            oneInning.execution();
        }
    }
}
