package com.company;

public class Main {

    public static void main(String[] args) {
        // ООП (Объектно-орентированное программирование)
        // объект:
        // + набор характеристик
        // + набор функций

        // 4 принципа ООП:
        // 1) Инкапсуляция
        // 2) Наследование
        // 3) Полиморфизм
        // 4) Абстракция
        // "class" - задает шаблон объекта

        // создание объектра класса Car
        Car car = new Car();
        car.maxSpeed = 200;
        car.color = "blue";
        System.out.println(car.maxSpeed);
        car.drive(192);
        car.doorsCount = 4;

        Car lada = new Car();
        lada.maxSpeed = 130;
        lada.color = "Sky blue";
        lada.drive(90);

        FireTruck ft = new FireTruck();
        ft.maxSpeed = 230;
        ft.color = "red";
        ft.drive(143);
        ft.doorsCount = 4;
        ft.fireOff();
        ft.fireOff(12.4f);

        // полиморфизм через приведение типов
        Car car3 = (Car)ft;
    }
}
