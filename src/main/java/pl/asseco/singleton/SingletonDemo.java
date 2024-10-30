package pl.asseco.singleton;

public class SingletonDemo {

  public static void main(String[] args) {
    JDBCConnection instance1 = JDBCConnection.INSTANCE;
    JDBCConnection instance2 = JDBCConnection.INSTANCE;
    instance1.setConnection("new");
    instance1.connect();
    instance2.connect();
  }
}
