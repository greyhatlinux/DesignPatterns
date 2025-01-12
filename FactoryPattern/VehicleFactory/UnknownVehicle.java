public class UnknownVehicle implements Vehicle{
    @Override
    public void drive(){
        System.out.println("This is not a recognised vehicle type. Cannot drive!");
    }
}
