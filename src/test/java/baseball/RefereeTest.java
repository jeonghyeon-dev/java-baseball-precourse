package baseball;

import baseball.model.Computer;
import baseball.model.Player;
import baseball.model.Referee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class RefereeTest {

    @DisplayName("3 스트라이크 테스트")
    @Test
    void three_strike_test(){

        Computer computer = new Computer();
        Player player = new Player();
        Referee referee = new Referee();
        computer.getNumber().setNumber("123");
        player.setNumber("123");
        referee.judgment(computer,player);
        assertThat(referee.isCorrect()).isTrue();
    }

    @DisplayName("3 볼 테스트")
    @Test
    void three_ball_test(){

        Computer computer = new Computer();
        Player player = new Player();
        Referee referee = new Referee();
        computer.getNumber().setNumber("123");
        player.setNumber("312");
        referee.judgment(computer,player);
        assertThat(referee.getCountOfBall()).isEqualTo(3);
    }

    @DisplayName("1 스트라이크 2 볼 테스트")
    @Test
    void one_strike_two_ball_test(){

        Computer computer = new Computer();
        Player player = new Player();
        Referee referee = new Referee();
        computer.getNumber().setNumber("123");
        player.setNumber("132");
        referee.judgment(computer,player);
        assertThat(referee.getCountOfStrike()).isEqualTo(1);
        assertThat(referee.getCountOfBall()).isEqualTo(2);
    }

}
