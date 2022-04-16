package baseball;

import java.util.List;
import java.util.Objects;

public class Referee {

    private int countOfStrike;
    private int countOfBall;

    public Referee() {
        countOfStrike = 0;
        countOfBall = 0;
    }

    public int getCountOfStrike() {
        return countOfStrike;
    }

    public int getCountOfBall() {
        return countOfBall;
    }

    public void judgment(Computer computer, Player player) {
        clear();
        calculationCountfOfStrike(computer.getNumber().getNumber(), player.getNumber().getNumber());
        calculationCountOfBall(computer.getNumber().getNumber(), player.getNumber().getNumber());
    }

    private void calculationCountfOfStrike(List<Integer> computerNumber, List<Integer> playerNumber) {
        for (int i = 0; i < computerNumber.size(); i++) {
            countOfStrike += Objects.equals(computerNumber.get(i), playerNumber.get(i)) ? 1 : 0;
        }
    }

    private void calculationCountOfBall(List<Integer> computerNumber, List<Integer> playerNumber) {
        for (int number : computerNumber) {
            countOfBall += playerNumber.contains(number) ? 1 : 0;
        }
        countOfBall = countOfBall - countOfStrike;
    }

    private void clear() {
        countOfStrike = 0;
        countOfBall = 0;
    }
}
