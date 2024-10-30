package pl.asseco.singleton;

public class LazySingleton {
  private static LazySingleton instance;

  private LazySingleton() {}

  public static LazySingleton getInstance() {
    // double-check
    if (instance == null) {
      synchronized (LazySingleton.instance) {
        if (instance == null) {
          instance = new LazySingleton();
        }
      }
    }

    return instance;
  }
}
