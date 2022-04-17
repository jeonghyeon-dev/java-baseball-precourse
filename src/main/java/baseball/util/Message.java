package baseball.util;

public class Message {

    private static final String INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String IS_NOT_NUMERIC_MESSAGE = "1 ~ 9 숫자만 입력 가능 합니다.";
    private static final String IS_NOT_3_DIGIT_MESSAGE = "세 자리 숫자만 입력 가능 합니다.";
    private static final String IS_NOT_DISTINCT_MESSAGE = "중복 된 숫자가 존재 합니다.";
    private static final String STRIKE = "스트라이크";
    private static final String BALL = "볼";
    private static final String NOTING_MEESAGE = "낫싱";
    private static final String CORRECT_MEESAGE = "3스트라이크\n3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String RESTART_QUESTION = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static String getInputMessage() {
        return INPUT_MESSAGE;
    }

    public static String getIsNotNumericMessage() {
        return IS_NOT_NUMERIC_MESSAGE;
    }

    public static String getIsNot3DigitMessage() {
        return IS_NOT_3_DIGIT_MESSAGE;
    }

    public static String getIsNotDistinctMessage() {
        return IS_NOT_DISTINCT_MESSAGE;
    }

    public static String getIsNotingMeesage() {
        return NOTING_MEESAGE;
    }

    public static String getCorrectMeesage() {
        return CORRECT_MEESAGE;
    }

    public static String getStrike() {
        return STRIKE;
    }

    public static String getBall() {
        return BALL;
    }

    public static String getRestartQuestion() {
        return RESTART_QUESTION;
    }

}
