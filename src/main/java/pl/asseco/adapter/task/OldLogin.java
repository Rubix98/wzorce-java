package pl.asseco.adapter.task;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OldLogin {
  public char[] pass;

  public String username;
  public String domain;
}
