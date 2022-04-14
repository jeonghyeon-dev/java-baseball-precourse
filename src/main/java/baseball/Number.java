package baseball;

import java.util.ArrayList;
import java.util.List;
import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Number {

    private static final int START_INCLUSIVE = 1;
    private static final int END_INCLSIVE = 9;
    private static final int MAX_SIZE_OF_NUMBERS = 3;

    private List<Integer> numbers = new ArrayList<>();

    public Number() {
        generateRandomNumbers();
    }

    public Number(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    private void generateRandomNumbers(){
        for(int i = 0; i < MAX_SIZE_OF_NUMBERS; i++){
            numbers.add(getRandomNumber());
        }
    }

    private int getRandomNumber(){
        int randomNumber = pickNumberInRange(START_INCLUSIVE, END_INCLSIVE);
        if(numbers.contains(randomNumber)){
            return getRandomNumber();
        }
        return randomNumber;
    }
}
