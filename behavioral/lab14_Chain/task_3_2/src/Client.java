public class Client {
    public static void main(String[] args) {

        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
        };

        Handler jpgHandler = new JpgHandler();
        Handler pngHandler = new PngHandler();
        Handler docxHandler = new DocxHandler();
        Handler docHandler = new DocHandler();
        Handler xlsHandler = new XlsHandler();
        Handler xlsxHandler = new XlsxHandler();
        Handler pptxHandler = new PptxHandler();
        Handler pdfHandler = new PdfHandler();

        jpgHandler.setNext(pngHandler);
        pngHandler.setNext(docxHandler);
        docxHandler.setNext(docHandler);
        docHandler.setNext(xlsHandler);
        xlsHandler.setNext(xlsxHandler);
        xlsxHandler.setNext(pptxHandler);
        pptxHandler.setNext(pdfHandler);

        // Create Chain of responsibility to open file by correct program according to the extension.
        for (String file : files) {
            jpgHandler.open(file);
        }


    }
}