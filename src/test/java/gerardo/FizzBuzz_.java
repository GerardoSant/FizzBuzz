package gerardo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;


@RunWith(org.junit.runners.Parameterized.class)
public class FizzBuzz_ {

    private final int number;
    private final String value;

    public FizzBuzz_(int number, String value) {
        this.number = number;
        this.value = value;
    }

    @Test
    public void execute(){
        assertThat(FizzBuzz.of(number)).isEqualTo(value);
    }

    @Parameterized.Parameters
    public static Object[][] cases(){
        return new Object[][]{
                {1,"1"},
                {2,"2"},
                {3,"fizz"},
                {6,"fizz"},
                {5,"buzz"},
                {10,"buzz"},
                {15,"fizzbuzz"},
                {30,"fizzbuzz"},
        };
    }

        /*
    @Test
    public void should_return_1_given_1() {

        assertThat(FizzBuzz.of(1)).isEqualTo("1");
       // assertEquals("1", actual);
    }
    @Test
    public void should_return_2_given_2() {

        assertThat(FizzBuzz.of(2)).isEqualTo("2");
        // assertEquals("1", actual);
    }
    @Test
    public void given_a_number_multiple_of_3_should_return_fizz() {

        assertThat(FizzBuzz.of(3)).isEqualTo("fizz");
        assertThat(FizzBuzz.of(6)).isEqualTo("fizz");
        // assertEquals("1", actual);
    }

    @Test
    public void given_a_number_multiple_of_5_should_return_buzz() {

        assertThat(FizzBuzz.of(5)).isEqualTo("buzz");
        assertThat(FizzBuzz.of(10)).isEqualTo("buzz");
        // assertEquals("1", actual);
    }

    @Test
    public void given_a_number_multiple_of_15_should_return_fizzbuzz() {

        assertThat(FizzBuzz.of(15)).isEqualTo("fizzbuzz");
        assertThat(FizzBuzz.of(30)).isEqualTo("fizzbuzz");
        // assertEquals("1", actual);
    }

*/

}
