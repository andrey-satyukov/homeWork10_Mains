package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        chekLeapYear(1700);
        chekOS(0, 2022);
        int deliveryDistance = 95;
        if (calculateDaysOfDelivery(deliveryDistance) == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.printf("Потребуется дней: %d", calculateDaysOfDelivery(deliveryDistance));
        }
    }

    public static void chekLeapYear(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            System.out.printf("%d год не является вискосным \n", year);
        } else if (year % 4 == 0) {
            System.out.printf("%d год является високосным \n", year);
        } else {
            System.out.printf("%d год не является вискосным\n", year);
        }

    }

    public static void chekOS(int typeOS, int yearDeviceClient) {
        int currentYear = LocalDate.now().getYear();
        if (typeOS == 0 && yearDeviceClient < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (typeOS == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (yearDeviceClient < currentYear) {
            System.out.println("становите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
    }

    public static int calculateDaysOfDelivery(int distance) {
        int countDays = 0;
        if (distance <= 20) {
           countDays  = 1;
        } else if (distance <= 60) {
            countDays = 2;
        } else if (distance <= 100) {
            countDays = 3;
        }
        return countDays;
    }

//    Доставка в пределах 20 км занимает сутки.
//    Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
//    Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
//            Свыше 100 км доставки нет.
//    То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
//    Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
//    Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.

}