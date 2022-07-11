package com.company; // НАСЛЕДОВАНИЕ

// Java не поддерживает множественное наследование
public class FireTruck extends Car {
    // shadowing
    public int maxSpeed;

    public void fireOff() {
        System.out.println("fire is off");
    }

    // перегрузка метода FireOff:
    // изименено кол-во аргументов
    public void fireOff(int h) {
        System.out.println("hours");
    }

    // перегрузка метода FireOff:
    // изименено кол-во аргументов
    public void fireOff(int h, int m) {
        System.out.println("hours and minutes");
    }

    // перегрузка метода FireOff:
    // изименено кол-во аргументов
    public void fireOff(float s) {
        System.out.println("seconds");
    }
}
