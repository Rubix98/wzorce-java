package pl.asseco.adapter.task;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Login {
  private String email;
  private String password;

}
