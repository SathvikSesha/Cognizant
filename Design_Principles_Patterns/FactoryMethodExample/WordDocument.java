package Design_Principles_Patterns.FactoryMethodExample;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening the word document");
    }
}
