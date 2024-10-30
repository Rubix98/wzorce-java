package pl.asseco.bridge;

public class MyRemoteController implements RemoteController{
  private TvSet tvset;

  public MyRemoteController(TvSet tvset) {
    this.tvset = tvset;
  }

  @Override
  public void pushVolUp() {
    tvset.volumeUp();
  }

  @Override
  public void pushVolDown() {
    tvset.volumeDown();
  }
}
