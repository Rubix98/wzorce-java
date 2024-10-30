package pl.asseco.factory;

import java.util.ArrayList;
import java.util.List;

public class FactoryDemo {

  public static void main(String[] args) {
    PublicationFactory factory = new PublicationFactory();
    factory.registerFactory("book", new BookFactory());
    factory.registerFactory("letter", new LetterFactory());
    factory.registerFactory("post", new PostFactory());
    String data = "book\tBloch\tJava\tContent book\nletter\tada@asseco.pl\tContent letter\npost\tauthor\t2023-12-14\tContent post";
    String[] lines = data.split("\n");
    List<Publication> list = new ArrayList<>();
    for (String line: lines) {
      Publication e = factory.create(line);
      if (e != null) {
        list.add(e);
      }
    }
    list.forEach(System.out::println);
  }
}
