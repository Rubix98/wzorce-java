package pl.asseco.observer;

public class ObserverDemo {

  public static void main(String[] args) {
    GameBoard gameBoard = new GameBoard();
    gameBoard.registerObserver(e -> System.out.println("Observer: " + e));
    gameBoard.registerObserver(new MoveCounter());
    gameBoard.move("X", 1, 2);
    gameBoard.move("O", 2, 1);

  }
}
