public class CurrentConditionDisplay implements Observer{
    private String name;

    public CurrentConditionDisplay(String name){
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println(name + " -> Temperature : " + temperature + "degree C | Humidity : " + humidity + " | Pressure : " + pressure);
    }
}
