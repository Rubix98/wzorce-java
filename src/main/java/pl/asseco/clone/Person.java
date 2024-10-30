package pl.asseco.clone;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Person implements Clonable<Person> {
  private String name;
  private LocalDate birth;

  public Person(Person person) {
    name = person.name;
    birth = person.birth;
  }

  @Override
  public Person clone() {
    return Person.builder()
        .name(name)
        .birth(birth)
        .build();
  }
}
