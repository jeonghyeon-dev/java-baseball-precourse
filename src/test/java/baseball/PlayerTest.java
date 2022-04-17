package baseball;

import baseball.model.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class PlayerTest {

    @DisplayName("숫자 입력 테스트")
    @Test
    void input_number_test(){

        Player player = new Player();
        player.setNumber("123");
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,2,3));
        assertThat(player.getNumber().getNumber()).isEqualTo(number).withFailMessage("입력 숫자와 다릅니다.");
    }
}
