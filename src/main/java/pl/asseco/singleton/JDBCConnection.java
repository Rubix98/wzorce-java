package pl.asseco.singleton;

public enum JDBCConnection {
  INSTANCE("jdbc:mysql");

  static public JDBCConnection getInstance() {
    return INSTANCE;
  }

  private String connection;
  JDBCConnection(String connection) {
    this.connection = connection;
  }

  public void setConnection(String connection) {
    this.connection = connection;
  }

  public void connect() {
    System.out.println(connection);
  }
}
