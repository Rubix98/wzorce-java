package pl.asseco.visitor;

import java.util.List;

public class VisitorDemo {

  public static void main(String[] args) {
    ComputerPart root = ComputerPart.builder()
        .name("Computer")
        .isWorking(true)
        .items(List.of(
            ComputerPart.builder().name("Main board").isWorking(true).items(List.of(
                ComputerPart.builder().name("RAM").isWorking(true).build()
            )).build(),
            ComputerPart.builder().name("Power supplier").isWorking(false).build()
        ))
        .build();

    ValidVisitor visitor = new ValidVisitor();
    root.accept(visitor);
    System.out.println(visitor.isWorking);
  }
}
