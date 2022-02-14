package com.galinachitak.main;

import com.galinachitak.details.Engine;
import com.galinachitak.professions.Driver;
import com.galinachitak.vehicles.Car;
import com.galinachitak.vehicles.Lorry;
import com.galinachitak.vehicles.SportCar;

public class Main {

    public static void main(String[] args) {
        /*1)  Автомобили. Создать класс Car в пакете vehicles , Engine в пакете details и Driver
         в пакете professions. Класс Driver содержит поля - ФИО, стаж вождения.
         Класс Engine содержит поля - мощность, производитель.
         Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver,
         мотор типа Engine. Методы start(), stop(), turnRight(), turnLeft(), которые выводят
         на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
         А также метод toString(), который выводит полную информацию об автомобиле, ее водителе
         и моторе.
         Создать производный от Car класс - Lorry (грузовик), характеризуемый также
         грузоподъемностью кузова. Создать производный от Car класс - SportCar,
         характеризуемый также предельной скоростью. Пусть класс Driver расширяет класс Person.

         2*) В класс Person вместо поля возраст добавить поле дата рождения как строка
         типа "18.12.1985"
         - добавить метод который выводит количество полных лет на данным момент.*/


        SportCar sportCar = new SportCar("Audi RS ", "S", 2390, 255);
        Driver sport = new Driver("12.01.1977", "Jessica Wilson", 3);
        Engine sportEngine = new Engine(" Porsche", 600);
        sportCar.setDriver(sport);
        sportCar.setEngine(sportEngine);
        System.out.println(sportCar);
        System.out.println(sport.fullName);
        sport.driverAge(sport.getAge());


        Lorry lorry = new Lorry("Mercedes-Benz ", "M", 11000, 7480);
        Driver lorryDriver = new Driver("08.11.1989", "Merry Smith", 4);
        Engine lorryEngine = new Engine("Mercedes-Benz R4", 210);
        lorry.setDriver(lorryDriver);
        lorry.setEngine(lorryEngine);
        System.out.println(lorry);
        System.out.println(lorryDriver.fullName);
        lorryDriver.driverAge(lorryDriver.getAge());


        Car car = new Car("Nissan", "С", 2000);
        Driver driver = new Driver("05.05.1991", "Patrik Brown", 5);
        Engine engine = new Engine("Nissan ", 274);
        car.setDriver(driver);
        car.setEngine(engine);
        System.out.println(driver.fullName);
        driver.driverAge(driver.getAge());

        System.out.println(car);
        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();


    }


}

