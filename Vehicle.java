abstract class Vehiclename{
    String brand;
    String model;
    Vehiclename(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    void showDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
    abstract String fuelType();
}
class petrolcar extends Vehiclename{
    petrolcar(String brand, String model){
        super(brand, model);
    }
    @Override
    String fuelType(){
        return "Petrol";
    }
}
class electriccar extends Vehiclename{
    electriccar(String brand, String model){
        super(brand, model);
    }
    @Override
    String fuelType(){
        return "Electric";
    }
}
public class Vehicle{
    public static void main(String[] args) {
        Vehiclename petrolCar = new petrolcar("Toyota", "Innova");
        Vehiclename electricCar = new electriccar("Tesla", "Model S");

        petrolCar.showDetails();
        System.out.println("Fuel Type: " + petrolCar.fuelType());

        System.out.println();

        electricCar.showDetails();
        System.out.println("Fuel Type: " + electricCar.fuelType());
    }
}