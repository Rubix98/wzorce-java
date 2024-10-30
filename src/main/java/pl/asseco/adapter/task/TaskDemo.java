package pl.asseco.adapter.task;

public class TaskDemo {

  public static void main(String[] args) {
    LoginService loginService = new LoginService();
    LoginAdapter loginAdapter = new LoginAdapter(loginService);
    OldLogin oldLogin = new OldLogin("pass".toCharArray(), "zenon", "asseco.pl");
    loginAdapter.login(oldLogin);
  }
}
