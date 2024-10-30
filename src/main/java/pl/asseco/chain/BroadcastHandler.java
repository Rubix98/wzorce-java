package pl.asseco.chain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BroadcastHandler implements RequestHandler{
  private RequestHandler next;
  @Override
  public void handle(String request) {
    if (request.startsWith("Broadcast:")) {
      System.out.println("Sending message to all");
      System.out.println(request.replace("Broadcast:", ""));
    } else {
      if (next != null) {
        next.handle(request);
      }
    }
  }
}
