package pl.asseco.visitor;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ComputerPart implements Visited {
  private List<ComputerPart> items;
  private String name;
  private boolean isWorking;

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
    if (items != null) {
      items.forEach(e ->e.accept(visitor));
    }

  }
}
