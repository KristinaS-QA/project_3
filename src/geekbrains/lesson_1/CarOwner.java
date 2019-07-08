package geekbrains.lesson_1;

import static java.sql.DriverManager.println;

public class CarOwner {
    public static void main(String[] args) {
        car mycar = new car();
        mycar.start();
        System out.println("Пробег за сегодня "+mycar.drive(2)+ "км");
        mycar.stop();
    }
}
