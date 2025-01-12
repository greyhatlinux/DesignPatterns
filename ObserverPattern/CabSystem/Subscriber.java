public interface Subscriber {
    void update(String location, Double price);

    String getName();
}
