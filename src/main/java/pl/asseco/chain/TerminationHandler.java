package pl.asseco.chain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TerminationHandler implements RequestHandler{
  private RequestHandler next;
  @Override
  public void handle(String request) {
    System.out.println("Nieznany rodzaj handlera");
  }
}
