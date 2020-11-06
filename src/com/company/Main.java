package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество студентов:");
        Test test = new Test(scan.nextInt());
    }
}
