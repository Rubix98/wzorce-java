package pl.asseco.factory;

public class LetterFactory implements AbstractFactory<Publication> {
  @Override
  public Publication create(String rawData) {
    String[] tokens = rawData.split("\t");
    return Letter.builder()
        .to(tokens[1])
        .content(tokens[2])
        .build();
  }
}
