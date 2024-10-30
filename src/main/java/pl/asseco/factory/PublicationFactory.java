package pl.asseco.factory;

import java.util.HashMap;
import java.util.Map;

public class PublicationFactory implements AbstractFactory<Publication>{
  private Map<String, AbstractFactory<Publication>> factories = new HashMap<>();
  public void registerFactory(String key, AbstractFactory<Publication> factory) {
    factories.putIfAbsent(key, factory);
  }
  @Override
  public Publication create(String rawData) {
      String[] tokens = rawData.split("\t");
      if (factories.containsKey(tokens[0])) {
        return factories.get(tokens[0]).create(rawData);
      }
      return null;
  }
}
