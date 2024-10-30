package pl.asseco.adapter;

import lombok.Data;

@Data
public class OldTvSet {
  private int volume;
  public void setVolume(int value) {
    volume = value;
  }

}
