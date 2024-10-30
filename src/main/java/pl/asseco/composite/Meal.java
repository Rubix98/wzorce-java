package pl.asseco.composite;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Meal implements Food {
  List<Food> ingrediants;
  @Override
  public double weight() {
    return ingrediants.stream().mapToDouble(Food::weight).sum();
  }

  @Override
  public double calories() {
    return ingrediants.stream().mapToDouble(Food::calories).sum();
  }
}
