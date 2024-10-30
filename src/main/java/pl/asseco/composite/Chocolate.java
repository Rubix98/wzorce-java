package pl.asseco.composite;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Chocolate implements Food {
  private double weight;
  private static final double caloriesPerGram = 2;

  @Override
  public double weight() {
    return weight;
  }

  @Override
  public double calories() {
    return weight * caloriesPerGram;
  }
}
