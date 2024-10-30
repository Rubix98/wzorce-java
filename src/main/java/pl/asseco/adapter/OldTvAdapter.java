package pl.asseco.adapter;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OldTvAdapter extends ModernTvSet {
  private OldTvSet tvSet;

  @Override
  public void up() {
    tvSet.setVolume(tvSet.getVolume() + 1);
  }

  @Override
  public void down() {
    tvSet.setVolume(tvSet.getVolume() - 1);
  }


}
