public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int clientOS = 1;
        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2022;
        switch (year) {
            case 2016:
                System.out.println("Год является високосным");
                break;
            case 2017:
            case 2018:
            case 2019:
                System.out.println("Год не является високосным");
                break;
            case 2020:
                System.out.println("Год является високосным");
                break;
            case 2021:
            case 2022:
            case 2023:
                System.out.println("Год не является високосным");
                break;
            case 2024:
                System.out.println("Год является високосным");
                break;
            case 2025:
            case 2026:
            case 2027:
                System.out.println("Год не является високосным");
                break;
            case 2028:
                System.out.println("Год является високосным");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1 );
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2 );
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3 );
        } else {
            System.out.println("Доставка не доставляется в вашу область");
        }

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNomber = 2;
        switch (monthNomber) {
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}