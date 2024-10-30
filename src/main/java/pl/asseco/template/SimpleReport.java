package pl.asseco.template;

import lombok.Builder;

@Builder
public class SimpleReport extends AbstractReport{
  private String title;
  private String body;

  @Override
  public String header() {
    return "";
  }

  @Override
  public String title() {
    return title;
  }

  @Override
  public String body() {
    return body;
  }

  @Override
  public String footer() {
    return "";
  }
}
