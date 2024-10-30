package pl.asseco.bridge;

public class BridgeDemo {

  public static void main(String[] args) {
    TvSet tv = new MyTvSet();
    RemoteController remoteController = new MyRemoteController(tv);
    remoteController.pushVolDown();
    remoteController.pushVolUp();
  }
}
