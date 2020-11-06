package com.company;

import java.util.*;

public class Test {
    public ArrayList<Student> IDNumber = new ArrayList<>();
    Test() { };
    Test(int cnt) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите данные студентов:");
        for (int i = 0; i < cnt; i++) {
            IDNumber.add(new Student(scan.next(), scan.nextDouble(), scan.nextInt()));
        }

        Search s1 = new Search(IDNumber);
        int r1 = rand.nextInt(IDNumber.size());
        System.out.println("Искомый студент: " + IDNumber.get(r1).getName());
        long startTime1 = System.nanoTime();
        int number1 = s1.linSearch(IDNumber.get(r1));
        long endTime1 = System.nanoTime();
        System.out.println("Номер искомого студента в коллекции: " + number1);
        System.out.println(IDNumber.get(number1 - 1).toString());

        Search s2 = new Search(IDNumber);
        int r2 = rand.nextInt(IDNumber.size());
        System.out.println("Искомый студент: " + IDNumber.get(r2).getName());
        long startTime2 = System.nanoTime();
        int number2 = s1.binSearch(IDNumber.get(r2), 0, IDNumber.size(), -1);
        long endTime2 = System.nanoTime();
        System.out.println("Номер искомого студента в коллекции: " + number2);
        System.out.println(IDNumber.get(number2 - 1).toString());

        System.out.println("Время работы 1 метода поиска: " + (endTime1 - startTime1) + " миллисек.");
        System.out.println("Время работы 2 метода поиска: " + (endTime2 - startTime2) + " миллисек.");
        System.out.println("2 метод быстрее 1 в " + (double)(endTime1 - startTime1)/(endTime2 - startTime2) + " раз");
        System.out.println("Сложность работы 1 метода поиска: " + cnt);
        System.out.println("Сложность работы 2 метода поиска: " + (Math.log(cnt)/Math.log(2)));
        System.out.println("Сложность 2 метода меньше 1 в " + cnt/(Math.log(cnt)/Math.log(2)) + " раз");
    }
}
