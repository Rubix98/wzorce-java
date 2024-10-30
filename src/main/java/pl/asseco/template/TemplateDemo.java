package pl.asseco.template;

import java.util.ArrayList;
import java.util.List;

public class TemplateDemo {

  public static void main(String[] args) {
    List<AbstractReport> reportList = new ArrayList<>();
    reportList.add(SimpleReport.builder().title("Tytuł").body("Abecadło z pieca spadło").build());
    reportList.add(FullReport.builder().header("Nagłówek").title("Tytuł").body("Abecadło z pieca spadło").footer("Stopka").build());

    reportList.forEach(e -> System.out.println(e.format()));
  }
}
