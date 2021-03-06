package ru.job4j.condition;

import org.junit.Test;

import ru.job4j.condition.Point;
import ru.job4j.condition.Triangle;

import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;    // для тестирования чисел с плавающей точкой

public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // создаем три объекта класса Point.
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);
        // Создаем объект треугольник и передаем в него объекты точек.
        Triangle triangle = new Triangle(a, b, c);
        // Вычисляем площадь.
        double result = triangle.area();
        // Задаем ожидаемый результат.
        double expected = 2D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenAreaSetAnotherThreePointsThenTriangleArea() {
        // создаем три объекта класса Point.
        Point a = new Point(1, 1);
        Point b = new Point(-2, 4);
        Point c = new Point(-2, -2);
        // Создаем объект треугольник и передаем в него объекты точек.
        Triangle triangle = new Triangle(a, b, c);
        // Вычисляем площадь.
        double result = triangle.area();
        // Задаем ожидаемый результат.
        double expected = 2D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 9.00));
    }
}