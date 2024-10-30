package pl.asseco.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Team implements Iterable<String> {
  private String lider;
  private String tester;
  private String member;

  @Override
  public Iterator<String> iterator() {
    return new TeamIterator();
  }

  public class TeamIterator implements Iterator<String> {
    private int counter = 0;

    @Override
    public boolean hasNext() {
      return counter < 3;
    }

    @Override
    public String next() {
      counter++;
      switch (counter) {
        case 1:
          return lider;
        case 2:
          return tester;
        case 3:
          return member;
        default:
          throw new NoSuchElementException("Ni ma");
      }

    }
  }
}
