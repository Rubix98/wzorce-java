package pl.asseco.facade;

import java.util.List;
import java.util.stream.Collectors;

public class Report {
  private Header header;
  private List<Paragraph> body;
  private Footer footer;

  public void addHeader(String content) {
    header = new Header();
  }

  public void addBody(List<String> body) {
    this.body = body.stream().map(s -> new Paragraph()).collect(Collectors.toList());
  }

  public void addFooter(Footer content) {
    footer = new Footer();
  }
}
