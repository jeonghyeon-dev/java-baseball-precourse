package baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Number {

    private static final int START_INCLUSIVE = 1;
    private static final int END_INCLSIVE = 9;
    private static final int MAX_SIZE_OF_NUMBERS = 3;

    private List<Integer> number = new ArrayList<>();

    public Number() {
        generateRandomNumbers();
    }

    public Number(String str){
        List<Integer> inputNumbers = convertStringToList(str);

        try{
            isValidNumbers(inputNumbers);
        }catch (IllegalArgumentException illegalArgumentException){
            System.out.println(illegalArgumentException.getMessage());
            System.exit(0);
        }

        this.number = inputNumbers;
    }

    public List<Integer> getNumbers() {
        return number;
    }

    private void generateRandomNumbers(){
        for(int i = 0; i < MAX_SIZE_OF_NUMBERS; i++){
            number.add(getRandomNumber());
        }
    }

    private int getRandomNumber(){
        int randomNumber = pickNumberInRange(START_INCLUSIVE, END_INCLSIVE);
        if(number.contains(randomNumber)){
            return getRandomNumber();
        }
        return randomNumber;
    }

    private void isValidNumbers(List<Integer> numbers)
            throws IllegalArgumentException{
        if(!isNumeric(numbers))
            throw new IllegalArgumentException(Message.getIsNotNumericMessage());

        if(!isDintinct(numbers))
            throw new IllegalArgumentException(Message.getIsNotDistinctMessage());

        if(!is3Digit(numbers))
            throw new IllegalArgumentException(Message.getIsNot3DigitMessage());

    }

    private  boolean isNumeric(List<Integer> numbers){
        boolean ret = true;
        for(int number : numbers)
            ret = number >= START_INCLUSIVE && number <= END_INCLSIVE ? true : false;

        return ret;
    }

    private boolean isDintinct(List<Integer> numbers){
        Set<Integer> setOfNumbers = new HashSet<>(numbers);
        return setOfNumbers.size() == numbers.size();
    }

    private boolean is3Digit(List<Integer> numbers){
        return numbers.size() == MAX_SIZE_OF_NUMBERS;
    }

    private List<Integer> convertStringToList(String str){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++)
            list.add(str.charAt(i)-'0');

        return list;
    }
}
