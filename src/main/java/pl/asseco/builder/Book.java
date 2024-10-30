package pl.asseco.builder;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Book {
  @NonNull
  private String title;
  private String author;
}
