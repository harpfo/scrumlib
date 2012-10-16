package info.pfoser.scrumlib;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ScrumLibTest {

    @Test
    public void shouldCalculateFibonacci13() {
        ScrumLib scrumlib = new ScrumLib();
        int expected = 14;
        int actual = scrumlib.nextFibonacci(5, 8);
        assertThat(actual, is(expected));
    }
 
    @Test
    public void shouldCalculateFibonacci8() {
        ScrumLib scrumlib = new ScrumLib();
        int expected = 8;
        int actual = scrumlib.nextFibonacci(3, 5);
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldCalculateFibonacci5() {
        ScrumLib scrumlib = new ScrumLib();
        int expected = 5;
        int actual = scrumlib.nextFibonacci(2, 3);

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldCalculateFibonacci3() {
        ScrumLib scrumlib = new ScrumLib();
        int expected = 3;
        int actual = scrumlib.nextFibonacci(1, 2);

        assertThat(actual, is(expected));
    }
}