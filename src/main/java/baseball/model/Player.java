package baseball.model;

public class Player {

    private Number number;

    public Player(){
        number = new Number();
    }

    public void setNumber(String str) {
        number.setNumber(str);
    }

    public Number getNumber() {
        return number;
    }

}
