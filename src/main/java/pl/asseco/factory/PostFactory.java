package pl.asseco.factory;

import java.time.LocalDate;

public class PostFactory implements AbstractFactory<Publication> {

  @Override
  public Publication create(String rawData) {
    String[] tokens = rawData.split("\t");
    return Post.builder()
        .title(tokens[1])
        .date(LocalDate.parse(tokens[2]))
        .content(tokens[3])
        .build();
  }
}
