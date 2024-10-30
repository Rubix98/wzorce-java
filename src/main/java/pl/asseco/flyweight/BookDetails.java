package pl.asseco.flyweight;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDetails {
  private String title;
  private String author;
}
