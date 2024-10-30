package pl.asseco.observer;

public class MoveCounter implements Observer<String>{
  private int counter;
  @Override
  public void notify(String event) {
    counter++;
    System.out.println("Licznik ruchów: " + counter);
  }
}
