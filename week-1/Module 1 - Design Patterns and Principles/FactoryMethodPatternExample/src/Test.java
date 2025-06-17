public class Test {
    public static void main(String[] args) {
        DocumentFactory WordFactory = new WordDocumentFactory();
        DocumentFactory PdfFactory = new PdfDocumentFactory();
        DocumentFactory ExcelFactory = new ExcelDocumentFactory();

        Document word = WordFactory.createDocument();
        Document pdf = PdfFactory.createDocument();
        Document excel = ExcelFactory.createDocument();

        word.open();
        pdf.open();
        excel.open();

    }
}
