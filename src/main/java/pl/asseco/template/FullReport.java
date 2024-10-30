package pl.asseco.template;

import lombok.Builder;

@Builder
public class FullReport extends AbstractReport{
  private String header;
  private String title;
  private String body;
  private String footer;

  @Override
  public String header() {
    return header;
  }

  @Override
  public String title() {
    return title + "\n" + "=".repeat(10);
  }

  @Override
  public String body() {
    return body;
  }

  @Override
  public String footer() {
    return "-".repeat(10) + "\n" + footer;
  }
}
