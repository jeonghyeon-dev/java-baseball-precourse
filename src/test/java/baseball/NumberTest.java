package baseball;

import baseball.model.Number;
import baseball.util.Message;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

public class NumberTest {

    @DisplayName("숫자 clear 테스트")
    @Test
    void clear_test() {

        Number number = new Number();
        number.generateRandomNumbers();
        number.clear();
        assertThat(number.getNumber().size()).isEqualTo(0).withFailMessage("Clear 가 안됐습니다.");
    }

    @DisplayName("랜덤 숫자 자리수 테스트")
    @Test
    void random_numbers_size_test() {

        Number number = new Number();
        number.generateRandomNumbers();
        int size = number.getNumber().size();
        assertThat(size).isEqualTo(3).withFailMessage("Size 는 3이어야 합니다.");
    }

    @DisplayName("랜덤 숫자 중복 숫자 테스트")
    @Test
    void random_numbers_duplicate_test() {

        Number number = new Number();
        number.generateRandomNumbers();
        Set<Integer> setOfNumbers = new HashSet<>(number.getNumber());
        assertThat(setOfNumbers.size()).isEqualTo(3).withFailMessage("중복 된 숫자가 있습니다.");
    }

    @DisplayName("숫자 입력 테스트")
    @Test
    void random_numbers_input_test() {

        String inputStr = "123";
        Number number = new Number();
        number.setNumber(inputStr);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        assertThat(number.getNumber()).isEqualTo(list).withFailMessage("입력 숫자와 다릅니다.");
    }

    @DisplayName("세 자리 이상 숫자인 경우 예외 테스트")
    @Test
    void user_input_number_is_not_3_digit() {

        String inputStr = "1234";
        Number number = new Number();
        assertThatThrownBy(() -> {
            number.setNumber("1234");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Message.getIsNot3DigitMessage());
    }


    @DisplayName("입력 숫자가 중복된 경우 예외 테스트")
    @Test
    void user_input_number_is_not_distinct() {

        Number number = new Number();
        assertThatThrownBy(() -> {
            number.setNumber("111");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Message.getIsNotDistinctMessage());
    }

    @DisplayName("입력이 숫자가 아닌 경우 예외 테스트")
    @Test
    void user_input_number_is_not_numeric() {

        Number number = new Number();
        assertThatThrownBy(() -> {
            number.setNumber("가나다");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Message.getIsNotNumericMessage());
    }

}
