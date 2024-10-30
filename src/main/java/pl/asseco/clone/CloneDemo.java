package pl.asseco.clone;

import java.time.LocalDate;

public class CloneDemo {

  public static void main(String[] args) {
    Person origin = Person.builder()
        .name("Zenon")
        .birth(LocalDate.of(2000, 1, 1))
        .build();

    Person clone = new Person(origin);

    System.out.println(origin);
    System.out.println(clone);

    origin.setName("nie-zenek");
    origin.setBirth(LocalDate.now());
    System.out.println("------------------------");

    System.out.println(origin);
    System.out.println(clone);
  }
}
