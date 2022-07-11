package another.pack; // создание нового пакета

import com.company.Car;
import com.company.Main;

public class Test {

    public static void main(String[] args) { // public void test() {}
        Car c = new Car();
        c.maxSpeed = 250;
        c.color = "gray";
        // c.drive(56);

        TestCar tc = new TestCar();
        tc.maxSpeed = 123;
        tc.color = "yellow";
        // tc.drive(45);
        // tc.doorsCount = 4;
    }
}
