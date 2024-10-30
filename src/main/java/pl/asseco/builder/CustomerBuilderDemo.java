package pl.asseco.builder;

public class CustomerBuilderDemo {

  public static void main(String[] args) {
    Customer customer = Customer.builder()
        .name("Zenon")
        .email("blaszanka@asseco.pl")
        .gender(1)
        .build();
    System.out.println(customer);

    Book book = Book.builder()
        .author("x")
        .build();

    System.out.println(book);
  }
}
