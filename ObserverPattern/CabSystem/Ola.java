public class Ola implements Subscriber {
    private final String name;

    public Ola(String name){
        this.name = name;
    }

    @Override
    public void update(String location, Double price){
        System.out.println(name + " | " + location + " | " + price);
    }

    @Override
    public String getName() {
        return name;
    }
}
