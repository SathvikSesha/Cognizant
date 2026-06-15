package Design_Principles_Patterns.FactoryMethodExample;

public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }

}
