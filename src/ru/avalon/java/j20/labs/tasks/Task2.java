package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Point;

/**
 * Задание №2.
 *
 * <p>Тема: "Создание обобщённых классов".
 */
public class Task2 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        /*
         * TODO(Студент): Выполнять задание №2
         *
         * 1. Выполнить обобщение класса Point с использованием
         *    шаблона так, чтобы в качестве координат точки
         *    можно было использовать любые числовые типы данных.
         *
         * 2. Создать  экземпляр типа Point:
         *
         *    - Создать точку, использующую для описания координат
         *      значения типа float.
         *
         *    - Создайте точку, использующую для описания координат
         *      значение типа int.
         *
         * 3. Вычислите дистанцию между точками.
         *
         * 4. С использованием отладчика проверьте корректность
         *    работы программы.
         */
        Point point1 = new Point<Integer>(2, 4);
        Point point2 = new Point<Float>(4.f, 8.f);
        double distance = point1.distanceTo(point2);
    }
}
