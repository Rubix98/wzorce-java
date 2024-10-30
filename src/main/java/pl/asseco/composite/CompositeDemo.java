package pl.asseco.composite;

import java.util.List;

public class CompositeDemo {

  public static void main(String[] args) {
    Meal deser = Meal.builder().ingrediants(List.of(
        new Banana(),
        Chocolate.builder().weight(100).build())
    ).build();
    System.out.println(deser.calories());
    System.out.println(deser.weight());
  }
}
