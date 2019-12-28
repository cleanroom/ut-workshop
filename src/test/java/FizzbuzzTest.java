import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzbuzzTest {

    @Test
    public void testName(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        assertThat(fizzbuzz.name()).isEqualTo("Hello World");
    }
}