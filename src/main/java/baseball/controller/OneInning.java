package baseball.controller;

import baseball.view.View;
import baseball.model.Computer;
import baseball.model.Player;
import baseball.model.Referee;

public class OneInning {

    private Player player;
    private Computer computer;
    private Referee referee;

    public OneInning() {
        computer = new Computer();
        player = new Player();
        referee = new Referee();
    }

    public void execution() {
        while (isExecuting(GameManager.getGameStatus())) {
            View.inputPlayerNumber();
            player.setNumber(camp.nextstep.edu.missionutils.Console.readLine());
            referee.judgment(computer, player);
            View.printJudgment(referee.getCountOfStrike(), referee.getCountOfBall());
            if (referee.isCorrect()) {
                GameManager.setGameStatus(Integer.parseInt(camp.nextstep.edu.missionutils.Console.readLine()));
                return;
            }
        }
    }

    private boolean isExecuting(int gameStatus) {
        return gameStatus == GameManager.EXECUTION_STATUS;
    }
}
