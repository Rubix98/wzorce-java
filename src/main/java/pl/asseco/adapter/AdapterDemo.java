package pl.asseco.adapter;

public class AdapterDemo {

  public static void main(String[] args) {
    OldTvSet tv = new OldTvSet();
    OldTvAdapter adapter = new OldTvAdapter(tv);
    RemoteController controller = new RemoteController(adapter);
    controller.volumeUp();
    controller.volumeUp();
    controller.volumeUp();
    System.out.println(tv);
  }
}
