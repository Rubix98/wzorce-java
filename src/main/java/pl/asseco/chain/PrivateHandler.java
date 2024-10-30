package pl.asseco.chain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PrivateHandler implements RequestHandler{
  private RequestHandler next;
  @Override
  public void handle(String request) {
    if (request.startsWith("Private:")) {
      request = request.replace("Private:", "");
      System.out.println(request);
    } else {
      if (next != null) {
        next.handle(request);
      }
    }
  }
}
