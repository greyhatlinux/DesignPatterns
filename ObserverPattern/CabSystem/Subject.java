public interface Subject {
    void addSubscribers(Subscriber subscriber);
    void removeSubscribers(Subscriber subscriber);
    void notifySubscribers();
}
