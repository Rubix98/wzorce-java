package pl.asseco.flyweight;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookItem {
  private int id;
  private BookDetails details;
}
