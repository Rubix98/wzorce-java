package pl.asseco.chain;

import java.util.Objects;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginHandler implements RequestHandler {
  private RequestHandler next;
  @Override
  public void handle(String request) {
    if (request.startsWith("Login:")) {
      System.out.println("User logged");
      if (Objects.equals(request.split(" ")[1], "Adam")) {
        next.handle("Private: you are logged!");
      } else {
        System.out.println("failed");
      }
    } else {
      if (next != null) {
        next.handle(request);
      }
    }
  }
}
