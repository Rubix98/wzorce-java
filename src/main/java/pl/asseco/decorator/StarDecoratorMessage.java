package pl.asseco.decorator;

import java.util.Arrays;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class StarDecoratorMessage extends Message {
  private Message decorated;

  private int longestLine() {
    return Arrays.stream(decorated.content().split("\n")).mapToInt(String::length).max().orElse(0);
  }

  @Override
  public String content() {
    return "*".repeat(longestLine()) + "\n" + decorated.content() + "\n" + "*".repeat(longestLine());
  }

  @Override
  public String format() {
    return "";
  }
}
