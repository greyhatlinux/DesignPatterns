public class Main {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay display1 = new CurrentConditionDisplay("Mobile");
        weatherData.registerObserver(display1);

        CurrentConditionDisplay display2 = new CurrentConditionDisplay("TV");
        weatherData.registerObserver(display2);

        CurrentConditionDisplay display3 = new CurrentConditionDisplay("Laptop");
        weatherData.registerObserver(display3);

        for(int i=0;i<5;i++){
            weatherData.setWeatherParameters(12+(float)i, 67+(float)i, 37+(float)i);
            System.out.println("-----");

            if(i==3) weatherData.removeObserver(display2);
        }

    }
}
