public class DocumentArea {
    private String text = "";
    
    public void insertText(String s) {
        text += s;
        System.out.println("DocumentArea: inserted \"" + s + "\"");
    }
    
    public void deleteSelection(int start, int end) {
        System.out.println("DocumentArea: deleted selection");
    }
    
    public String getText() {
        return text;
    }
}