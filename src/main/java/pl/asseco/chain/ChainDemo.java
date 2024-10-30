package pl.asseco.chain;

public class ChainDemo {

  public static void main(String[] args) {
    RequestHandler head = new LoginHandler(new PrivateHandler(new BroadcastHandler(new TerminationHandler(null))));

    head.handle("Broadcast: abecadło z pieca spadło");
    System.out.println("--------------------");
    head.handle("Private: wiadomość prywatna");
    System.out.println("--------------------");
    head.handle("Login: Adam");
    System.out.println("--------------------");
    head.handle("ABC");
  }
}
