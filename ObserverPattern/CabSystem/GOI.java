import java.util.ArrayList;

public class GOI implements Subject {
    private final String name;
    private final ArrayList<Subscriber> all_subscribers;
    private String location;
    private Double price;

    public GOI(String name){
        this.name = name;
        this.all_subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscribers(Subscriber subscriber){
        System.out.println("Adding a new Subscriber : " + subscriber.getName());
        all_subscribers.add(subscriber);
    }

    @Override
    public void removeSubscribers(Subscriber subscriber){
        System.out.println("Removing a new Subscriber : " + subscriber.getName());
            all_subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(){
        for(Subscriber subscriber : all_subscribers){
            subscriber.update(location, price);
        }
    }

    public void changeStats(String location, Double price){
        this.location = location;
        this.price = price;
        notifySubscribers();
    }

    public String getName() {
        return name;
    }
}
