package baseball.model;

public class Computer {

    private Number number;

    public Computer() {
        this.number = new Number();
        number.generateRandomNumbers();
    }

    public Number getNumber() {
        return number;
    }

}
