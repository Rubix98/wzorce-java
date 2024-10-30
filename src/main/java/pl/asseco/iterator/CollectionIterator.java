package pl.asseco.iterator;


public class CollectionIterator {

  public static void main(String[] args) {
    Team team = Team.builder().lider("lider").tester("tester").member("member").build();
    for (String name: team) {
      System.out.println(name);
    }
  }
}
