package ru.job4j.array;

import org.junit.Test;

import ru.job4j.array.Turn;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TurnTest {
    Turn turn = new Turn();
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с чётным числом элементов, например {2, 6, 1, 4}.
        int[] testArray = {2, 6, 1, 4};
        int[] result = turn.back(testArray);
        int[] expected = {4, 1, 6, 2};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
        int[] testArray = {1, 2, 3, 4, 5};
        int[] result = turn.back(testArray);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }
}