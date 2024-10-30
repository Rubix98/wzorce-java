package pl.asseco.visitor;

public class PrintVisitor implements Visitor {

  @Override
  public void visit(ComputerPart computerPart) {
    System.out.println(computerPart.getName());
  }
}
