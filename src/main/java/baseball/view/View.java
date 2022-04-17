package baseball.view;

import baseball.util.Message;

public class View {

    public static void inputPlayerNumber() {

        System.out.print(Message.getInputMessage());
    }

    public static void printJudgment(int countOfStrike, int countOfBall) {
        if (isCorrect(countOfStrike)) {
            System.out.println(Message.getCorrectMeesage());
            System.out.println(Message.getRestartQuestion());
        }
        if (isNothing(countOfStrike, countOfBall)) {
            System.out.println(Message.getIsNotingMeesage());
        }
        printCountOfBall(countOfStrike, countOfBall);
        printCountOfStike(countOfStrike, countOfBall);
    }

    private static boolean isCorrect(int countOfStrike) {
        return countOfStrike == 3;
    }

    private static boolean isNothing(int countOfStrike, int countOfBall) {
        return countOfStrike == 0 && countOfBall == 0;
    }

    private static void printCountOfBall(int countOfStrike, int countOfBall) {
        if (countOfBall == 0){
            return;
        }
        if (countOfStrike == 0) {
            System.out.println(countOfBall + Message.getBall());
            return;
        }
        System.out.print(countOfBall + Message.getBall());
    }

    private static void printCountOfStike(int countOfStrike, int countOfBall) {
        if (countOfStrike == 0 || countOfStrike == 3){
            return;
        }
        if (countOfBall == 0) {
            System.out.println(countOfStrike + Message.getStrike());
            return;
        }
        System.out.println(" " + countOfStrike + Message.getStrike());
    }

}
