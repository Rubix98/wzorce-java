package pl.asseco.decorator;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class EmailMessage extends Message {
  private String to;
  private String from;

  @Override
  public String content() {
    return getContent();
  }

  @Override
  public String format() {
    return String.format("to: %s\nfrom:%s\ncontent:%s", to, from, content());
  }
}
