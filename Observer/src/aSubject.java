public interface aSubject {
    void addObserver(anObserver observer);
    void removeObserver(anObserver observer);
    void notifyAllObservant();
}