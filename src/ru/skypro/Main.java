package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code her


        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("установите версию приложения для iOS по ссылке");
            if (clientOS == 1) {
                System.out.println("установите версию приложения для android по ссылке");
            }
        }


        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            System.out.println("установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear >= 2015) {
            System.out.println("установите версию приложения для iOS 2 по ссылке");
        }


        char device = 'i';
        int cclientDeviceYear = 2014;
        if (device == 'i' && cclientDeviceYear >= 2015) {
            System.out.println("установите версию приложения для iOS 2 по ссылке");

        }  else if (device == 'i' && cclientDeviceYear <= 2015) {
            System.out.println("установите облегченную версию приложения для iOS по ссылке");
        }  else if (device == 'a' && cclientDeviceYear >= 2015) {
                System.out.println("установите версию приложения для android 2 по ссылке");
            } else {
                System.out.println("установите облегченную версию приложения для android по ссылке");
            }









        int year = 2000;
        switch (year) {
            case 2024:
            case 2020:
            case 2016:
            case 2012:
            case 2008:
            case 2004:
            case 2000:
            case 1996:
                System.out.println("1 год является високосным");
                break;
            default:
                System.out.println("2 год не является високосным");
        }


        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 ");
        } else if ( deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <=100 ) {
            System.out.println("Потребуется дней: 3");
        }


        int monthNumber = 1;
        switch (monthNumber ) {
            case 1:
            case 2:
            case 12:
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
            default:
                System.out.println("Такого месяца нет");

        }



























        }


    }


