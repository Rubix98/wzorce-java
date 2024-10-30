package pl.asseco.observer;

public interface Observer<T> {
  void notify(T event);
}
