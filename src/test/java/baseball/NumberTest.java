package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberTest {

    @DisplayName("랜덤 숫자 자리수 테스트")
    @Test
    void random_numbers_size_test(){

        Number number = new Number();

        int size = number.getNumbers().size();
        assertThat(size).isEqualTo(3).withFailMessage("Size 는 3이어야 합니다.");
    }

    @DisplayName("랜덤 숫자 중복 숫자 테스트")
    @Test
    void random_numbers_duplicate_test(){

        Number number = new Number();

        Set<Integer> setOfNumbers = new HashSet<>(number.getNumbers());

        assertThat(setOfNumbers.size()).isEqualTo(3).withFailMessage("중복 된 숫자가 있습니다.");

    }

    @DisplayName("숫자 입력 테스트")
    @Test
    void random_numbers_input_test(){

        String inputStr = "123";
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        Number number = new Number(inputStr);

        assertThat(number.getNumbers()).isEqualTo(list).withFailMessage("입력 숫자와 다릅니다.");
    }

}
