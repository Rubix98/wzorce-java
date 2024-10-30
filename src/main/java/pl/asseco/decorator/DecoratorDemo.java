package pl.asseco.decorator;

public class DecoratorDemo {

  public static void main(String[] args) {
    Message emailMessage = EmailMessage.builder()
        .to("odbiorca@asseco.pl")
        .from("nadawca@asseco.pl")
        .content("No siema")
        .build();

    Message signMessage = SignDecoratorMessage.builder().decorated(emailMessage).sign("Podpis").build();
    Message starMessage = StarDecoratorMessage.builder().decorated(signMessage).build();

    System.out.println(starMessage.content());
  }
}
