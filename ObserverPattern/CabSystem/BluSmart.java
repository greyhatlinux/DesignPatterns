public class BluSmart implements Subscriber{
    private final String name;

    public BluSmart(String name){
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
