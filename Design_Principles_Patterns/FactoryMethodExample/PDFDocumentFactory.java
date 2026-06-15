package Design_Principles_Patterns.FactoryMethodExample;

public class PDFDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
