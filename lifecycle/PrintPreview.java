package lifecycle;

public class PrintPreview {
    public void showPreview() {
        System.out.println("PrintPreview: showing page layout");
    }
    
    public void print(String printerName, int copies) {
        System.out.println("PrintPreview: printing to " + printerName + ", copies=" + copies);
    }
}