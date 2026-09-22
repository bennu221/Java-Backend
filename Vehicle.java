public class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed + " km/h");
    }

    public static void main(String[] args) {
        ElectricCar car = new ElectricCar("Tesla", 180, "Electric", 75);

        car.display();
        System.out.println("Fuel Type : " + car.fuelType);
        System.out.println("Battery   : " + car.batteryCapacity + " kWh");
        car.charge();
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int speed, String fuelType, int batteryCapacity) {
        super(brand, speed, fuelType);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println("Car is Charging");
    }
}