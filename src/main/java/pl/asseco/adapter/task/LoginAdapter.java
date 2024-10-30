package pl.asseco.adapter.task;

import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginAdapter{
  private final LoginService loginService;

  public boolean login(OldLogin oldLogin) {
    String email = oldLogin.username + "@" + oldLogin.domain;
    String password = Arrays.toString(oldLogin.pass);
    return loginService.login(new Login(email, password));
  }
}
