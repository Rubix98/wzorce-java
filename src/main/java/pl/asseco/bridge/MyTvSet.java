package pl.asseco.bridge;

public class MyTvSet implements TvSet{

  @Override
  public void volumeUp() {
    System.out.println("Volume up");
  }

  @Override
  public void volumeDown() {
    System.out.println("Volume down");
  }
}
