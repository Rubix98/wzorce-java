package pl.asseco.composite;

public class Banana implements Food {

  @Override
  public double weight() {
    return 100;
  }

  @Override
  public double calories() {
    return 50;
  }
}
