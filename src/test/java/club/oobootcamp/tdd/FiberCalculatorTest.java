package club.oobootcamp.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FiberCalculatorTest {
    @Test
    void should_return_1_when_index_1_or_2() {
        assertThat(FiberCalculator.calculate(1)).isEqualTo(1);
        assertThat(FiberCalculator.calculate(2)).isEqualTo(1);
    }

    @Test
    void should_return_correct_number_when_index_between_3_and_50() {
        assertThat(FiberCalculator.calculate(3)).isEqualTo(2);
        assertThat(FiberCalculator.calculate(5)).isEqualTo(5);
        assertThat(FiberCalculator.calculate(8)).isEqualTo(21);
        assertThat(FiberCalculator.calculate(10)).isEqualTo(55);
    }

    @Test
    void should_throw_exception_when_index_below_1() {
        assertThrows(IllegalArgumentException.class,
                () -> FiberCalculator.calculate(0));
        assertThrows(IllegalArgumentException.class,
                () -> FiberCalculator.calculate(-10));
    }

    @Test
    void should_throw_exception_when_index_above_50() {
        assertThrows(IllegalArgumentException.class,
                () -> FiberCalculator.calculate(51));
        assertThrows(IllegalArgumentException.class,
                () -> FiberCalculator.calculate(100));
    }

    @Test
    void should_return_12586269025_number_when_index_50() {
        assertThat(FiberCalculator.calculate(50)).isEqualTo(12586269025L);
    }
}
