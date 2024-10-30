package pl.asseco.factory;


import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@ToString(callSuper=true)
public class Book extends Publication {
  private String title;
  private String author;
}
