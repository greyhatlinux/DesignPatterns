public class Main {
    public static void main(String[] args){
        Vehicle car = VehicleFactory.createVehicle("car");
        car.drive();

        Vehicle bike = VehicleFactory.createVehicle("Bike");
        bike.drive();

        Vehicle scooty = VehicleFactory.createVehicle("Scooty");
        scooty.drive();

        Vehicle bike2 = VehicleFactory.createVehicle("Bike");
        bike2.drive();
    }
}
