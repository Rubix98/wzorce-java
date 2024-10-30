package pl.asseco.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@ToString(callSuper=true)
public class Letter extends Publication {
  private String to;
}
