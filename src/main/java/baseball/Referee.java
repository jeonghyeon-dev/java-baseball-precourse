package baseball;

import java.util.List;

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
            countOfStrike += getSameCountNumber(computerNumber.get(i), playerNumber.get(i));
        }
    }

    private void calculationCountOfBall(List<Integer> computerNumber, List<Integer> playerNumber) {
        for (int number : computerNumber) {
            countOfBall += getSameCountNumber(number, playerNumber)
        }
        countOfBall = countOfBall - countOfStrike;
    }

    private void clear() {
        countOfStrike = 0;
        countOfBall = 0;
    }

    private int getSameCountNumber(int computerNumber, int playerNumber) {
        if (computerNumber == playerNumber)
            return 1;
        return 0;
    }

    private int getSameCountNumber(int computerNumber, List<Integer> playerNumber) {
        if (playerNumber.contains(computerNumber))
            return 1;
        return 0;
    }
}
