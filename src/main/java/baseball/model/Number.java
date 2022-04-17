package baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Number {

    private static final int START_INCLUSIVE = 1;
    private static final int END_INCLSIVE = 9;
    private static final int MAX_SIZE_OF_NUMBERS = 3;

    private ArrayList<Integer> number;

    public Number() {
        number = new ArrayList<>();
    }

    public void setNumber(String str) {

        ArrayList<Integer> inputNumbers = convertStringToList(str);

        try {
            isValidNumbers(inputNumbers);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            System.exit(0);
        }

        this.number = inputNumbers;
    }

    public void clear() {
        this.number.clear();
    }

    public ArrayList<Integer> getNumber() {
        return number;
    }

    public void generateRandomNumbers() {
        for(int i = 0; i < MAX_SIZE_OF_NUMBERS; i++){
            number.add(getRandomNumber());
        }
    }

    private int getRandomNumber() {
        int randomNumber = camp.nextstep.edu.missionutils.Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLSIVE);
        if(number.contains(randomNumber)){
            return getRandomNumber();
        }
        return randomNumber;
    }

    private void isValidNumbers(ArrayList<Integer> numbers)
            throws IllegalArgumentException {
        if (!isNumeric(numbers))
            throw new IllegalArgumentException(Message.getIsNotNumericMessage());

        if (!isDintinct(numbers))
            throw new IllegalArgumentException(Message.getIsNotDistinctMessage());

        if (!is3Digit(numbers))
            throw new IllegalArgumentException(Message.getIsNot3DigitMessage());

    }

    private boolean isNumeric(ArrayList<Integer> numbers) {
        boolean ret = true;
        for (int number : numbers)
            ret = number >= START_INCLUSIVE && number <= END_INCLSIVE;

        return ret;
    }

    private boolean isDintinct(ArrayList<Integer> numbers) {
        Set<Integer> setOfNumbers = new HashSet<>(numbers);
        return setOfNumbers.size() == numbers.size();
    }

    private boolean is3Digit(ArrayList<Integer> numbers) {
        return numbers.size() == MAX_SIZE_OF_NUMBERS;
    }

    private ArrayList<Integer> convertStringToList(String str) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++)
            list.add(str.charAt(i) - '0');

        return list;
    }
}
