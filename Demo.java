public class Demo {
    public Doc getDoc(String docType) {
        if (docType == null) {
            return null;
        }
        if (docType.equalsIgnoreCase("WordDoc")) {
            return new WordDoc();
        } else if (docType.equalsIgnoreCase("PdfDoc")) {
            return new PdfDoc();
        } else if (docType.equalsIgnoreCase("ExcelDoc")) {
            return new ExcelDoc();
        }
        return null;
    }
}