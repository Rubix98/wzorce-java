package pl.asseco.visitor;

public class ValidVisitor implements Visitor {
  boolean isWorking = true;
  @Override
  public void visit(ComputerPart computerPart) {
    isWorking &= computerPart.isWorking();
  }
}
