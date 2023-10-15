
package HW2main.Test;

import HW2main.Car;
import HW2main.Motorcycle;
import HW2main.Vehicle;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

public class VehicleTest {

    //- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    void checkCarIsInstanceOfVehicle(){
        Car car = new Car("Mercedes", "Benz", 2018);
        assertThat(car).isInstanceOf(Vehicle.class);
    }
    //- Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void checkCarHasFourWheels(){
        Car car = new Car("Mercedes", "Benz", 2018);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    //- Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void checkMotorcycleHasTwoWheels(){
        Motorcycle motorcycle = new Motorcycle("Ducati", "Superleggera", 2015);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }
    //- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void checkCarSpeed(){
        Car car = new Car("Mercedes", "Benz", 2018);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    //- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void checkMotoSpeed(){
        Motorcycle motorcycle = new Motorcycle("Ducati", "Superleggera", 2015);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }
    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    void checkCarSpeedWhenParked(){
        Car car = new Car("Mercedes", "Benz", 2018);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    void checkMotoSpeedWhenParked(){
        Motorcycle motorcycle = new Motorcycle("Ducati", "Superleggera", 2015);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
