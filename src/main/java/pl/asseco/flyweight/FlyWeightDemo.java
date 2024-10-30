package pl.asseco.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyWeightDemo {

  public static void main(String[] args) {
    List<BookItem> books = new ArrayList<>();
    BookDetails details = BookDetails.builder().title("Tytuł").author("Author").build();
    books.add(BookItem.builder().id(1).details(details).build());
    books.add(BookItem.builder().id(2).details(details).build());
    books.add(BookItem.builder().id(3).details(details).build());
    System.out.println(books);
  }
}
