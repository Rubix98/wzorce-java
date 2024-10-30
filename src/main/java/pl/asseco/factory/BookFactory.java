package pl.asseco.factory;

public class BookFactory implements AbstractFactory<Publication> {

  @Override
  public Publication create(String rawData) {
    String[] tokens = rawData.split("\t");
    return Book.builder()
        .title(tokens[1])
        .author(tokens[2])
        .content(tokens[3])
        .build();
  }
}
