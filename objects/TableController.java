package objects;

public class TableController {
    public void insertTable(int rows, int cols) {
        System.out.println("TableController: inserted " + rows + "x" + cols + " table");
    }
    
    public void addRow() {
        System.out.println("TableController: row added");
    }
    
    public void mergeCells(int row1, int col1, int row2, int col2) {
        System.out.println("TableController: merged cells");
    }
}
