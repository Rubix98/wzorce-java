package pl.asseco.template;

public abstract class AbstractReport {
  public abstract String header();
  public abstract String title();
  public abstract String body();
  public abstract String footer();
  public String format() {
    StringBuilder sb = new StringBuilder();
    sb.append(header()).append("\n").append(title()).append("\n").append(body()).append("\n").append(footer());
    return sb.toString();
  }
}
