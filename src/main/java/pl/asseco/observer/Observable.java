package pl.asseco.observer;

public interface Observable<T> {
  void registerObserver(Observer<T> observer);
  void removeObserver(Observer<T> observer);

}
