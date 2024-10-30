package pl.asseco.factory;

public interface AbstractFactory<T> {
  T create(String rawData);
}
