package ru.job4j.loop;

import org.junit.Test;

import ru.job4j.loop.Counter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter cnt = new Counter();
        int result = cnt.add(1, 10);
        assertThat(result, is(30));
    }

}