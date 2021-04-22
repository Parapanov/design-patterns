public interface Observeble {
    public void registerObserver(Observer observer);
    public void notifyObserver();
    public void removeObserver(Observer observer);
}
