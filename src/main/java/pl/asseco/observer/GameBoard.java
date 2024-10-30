package pl.asseco.observer;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Observable<String> {

  private List<Observer<String>> observers = new ArrayList<>();

  @Override
  public void registerObserver(Observer<String> observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer<String> observer) {
    observers.remove(observer);
  }

  public void move(String player, int x, int y) {
    System.out.println("Player " + player + " make move");
    notifyObservers(String.format("Move by %s to {%d, %d}", player, x, y));
  }

  private void notifyObservers(String event) {
    observers.forEach(c -> c.notify(event));
  }
}
