package Design_Principles_Patterns.FactoryMethodExample;

public class PDFDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF...");
    }
}
