package baseball;

import baseball.model.Computer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class ComputerTest {

    @DisplayName("랜덤 숫자 자리수 테스트")
    @Test
    void random_numbers_size_test() {

        Computer computer = new Computer();
        int size = computer.getNumber().getNumber().size();
        assertThat(size).isEqualTo(3).withFailMessage("Size 는 3이어야 합니다.");
    }

    @DisplayName("랜덤 숫자 중복 숫자 테스트")
    @Test
    void random_numbers_duplicate_test() {

        Computer computer = new Computer();
        Set<Integer> setOfNumbers = new HashSet<>(computer.getNumber().getNumber());
        assertThat(setOfNumbers.size()).isEqualTo(3).withFailMessage("중복 된 숫자가 있습니다.");
    }
}
