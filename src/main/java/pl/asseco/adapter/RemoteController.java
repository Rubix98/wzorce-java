package pl.asseco.adapter;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RemoteController {
  ModernTvSet tvset;
  public void volumeUp() {
    tvset.up();
  }

  public void volumeDown() {
    tvset.down();
  }
}
