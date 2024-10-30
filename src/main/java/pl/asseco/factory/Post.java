package pl.asseco.factory;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@ToString(callSuper=true)
public class Post extends Publication {
  private String title;
  private LocalDate date;
}
