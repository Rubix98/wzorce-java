package pl.asseco.decorator;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class SMSMessage extends Message {
  private String phone;
  @Override
  public String content() {
    return getContent();
  }

  @Override
  public String format() {
    return String.format("phone: %s\ncontent:%s", phone, content());
  }
}
