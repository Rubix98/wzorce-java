package pl.asseco.decorator;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class SignDecoratorMessage extends Message {
  private Message decorated;
  private String sign;

  @Override
  public String content() {
    return decorated.content() + "\n" + sign;
  }

  @Override
  public String format() {
    return "";
  }
}
