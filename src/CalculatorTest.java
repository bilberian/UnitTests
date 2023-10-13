
import static org.assertj.core.api.Assertions.*;


public class CalculatorTest {
    public static void main(String[] args) {
        // Проверка базового функционала с целыми числами:
        if (8 != Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (0 != Calculator.calculation(2, 2, '-')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (14 != Calculator.calculation(2, 7, '*')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (2 != Calculator.calculation(100, 50, '/')) {
            throw new AssertionError("Ошибка в методе");
        }

        // проверка базового функционала расчета цены со скидкой
        assertThat(Calculator.calculateDiscountedPrice(12000, 60)).isEqualTo(4800);
        assertThat(Calculator.calculateDiscountedPrice(10000, 0)).isEqualTo(10000);

        // проверка функционала расчета цены со скидкой при вводе неправильных
        // аргументов
        // Цена ниже 0
        assertThatThrownBy(() -> Calculator.calculateDiscountedPrice(-10000, 10)).isInstanceOf(RuntimeException.class);
        // Скидка меньше 0
        assertThatThrownBy(() -> Calculator.calculateDiscountedPrice(5000, -30)).isInstanceOf(RuntimeException.class);
        // Скидка больше 100%
        assertThatThrownBy(() -> Calculator.calculateDiscountedPrice(3000, 150)).isInstanceOf(RuntimeException.class);

        System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
        System.out.println(Calculator.squareRootExtraction(169));
        System.out.println(Calculator.calculateDiscountedPrice(15000, 15));

    }

}