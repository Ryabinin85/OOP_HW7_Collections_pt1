package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    //Подходя к кассе супермаркета, мы выбираем очередь, в которой меньше всего людей.
// Когда становится слишком много людей, один из сотрудников вызывает Галю, открывающую дополнительную кассу.
//Напишите программу, в которой имитируется данное поведение.
//Создайте 2 очереди (Queue<String>) с максимальной размерностью 5.
// Заполните обе очереди случайным количеством элементов (от 0 до 5 — для каждой очереди свой случайный элемент).
// В качестве значения используйте имя человека в этой очереди (можно использовать любую строку/строки).
//Напишите новый метод, принимающий строку (имя человека), который добавляет человека в очередь,
// где меньше всего людей. Если обе очереди заполнены, выведите в консоль просьбу позвать Галю.
//Дополнительное условие со звездочкой
//(необязательно к решению)
//Создайте еще одну, третью, очередь и включите ее в работу.
//Напишите еще один метод, при вызове которого удаляется человек из случайной очереди.
//
//Критерии оценки
//Выбрана реализация очереди с возможностью ограничить максимальное количество элементов.
//Начальное заполнение элементов в 2 очередях выполняется согласно условиям задачи.
//Новый человек добавляется в очередь с наименьшим количеством элементов.
//При полном заполнении двух очередей информация об этом выводится на экран (*или создается еще одна очередь).
//Программа не падает с ошибкой.
//При удалении элемента очередь выбирается случайно.
    public static void main(String[] args) {
        Random random = new Random();


        Queue<Integer> queue1 = new ArrayBlockingQueue<>(10);
        Queue<Integer> queue2 = new ArrayBlockingQueue<>(10);
        Queue<Integer> queue3 = new ArrayBlockingQueue<>(10);
        int j = random.nextInt(3);

        for (int i = 1; i < 100; i++) {
            try {
                if (queue2.size() <= queue1.size()) {
                    queue2.add(i);
                } else queue1.add(i);
            } catch (IllegalStateException e) {
                System.out.println("Обе очереди заполнены, позовите Галю!!!");
                queue3.offer(i);
            }
        }
        System.out.println(queue1);
        System.out.println(queue2);
        System.out.println(queue3);

        while ((queue1.size() + queue2.size() + queue3.size()) != 0) {
            switch (j + 1) {
                case 1:
                    queue1.poll();
                    System.out.println(queue1);
                    j = random.nextInt(3);
                    break;
                case 2:
                    queue2.poll();
                    System.out.println(queue2);
                    j = random.nextInt(3);
                    break;
                case 3:
                    queue3.poll();
                    System.out.println(queue3);
                    j = random.nextInt(3);
                    break;
                default:
                    j = random.nextInt(3);
            }
        }
    }
}
