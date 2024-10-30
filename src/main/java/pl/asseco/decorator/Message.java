package pl.asseco.decorator;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class Message {
  private String content;
  public abstract String content();
  public abstract String format();
}
