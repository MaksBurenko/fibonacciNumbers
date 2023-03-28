import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class fibonacciNumbersTest {
    @Test
    public void testCalculate1() {
        assertThat(fibonacciNumbers.calculate(0), is(0));
    }
    @Test
    public void testCalculate2() {
        assertThat(fibonacciNumbers.calculate(1), is(1));
    }
    @Test
    public void testCalculate3() {
        assertThat(fibonacciNumbers.calculate(2), is(1));
    }
    @Test
    public void testCalculate4() {
        assertThat(fibonacciNumbers.calculate(7), is(13));
    }
    @Test
    public void testCalculate5() {
        assertThat(fibonacciNumbers.calculate(10), is(55));
    }
    @Test
    public void testCalculate6() {
        assertThat(fibonacciNumbers.calculate(14), is(377));
    }
}