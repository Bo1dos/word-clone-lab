package lifecycle;

public class FileIO {
    public void save(String path, String content) {
        System.out.println("FileIO: saving to " + path);
    }
    
    public String open(String path) {
        System.out.println("FileIO: opening " + path);
        return "document content";
    }
    
    public void exportToPDF(String path) {
        System.out.println("FileIO: exporting to PDF: " + path);
    }
    
    public void importHTML(String html) {
        System.out.println("FileIO: importing HTML content");
    }
}
