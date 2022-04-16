package baseball;

public class Computer {

    Number number;

    public Computer() {
        this.number = new Number();
    }

    public void reGenerateNumber(){
        number.clear();
        number.generateRandomNumbers();
    }
}
