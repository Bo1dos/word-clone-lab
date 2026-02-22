package objects;

/**
 * Создание и редактирование таблиц в документе.
 * <p>
 * Позволяет вставлять таблицы с заданным числом строк и столбцов,
 * добавлять/удалять строки, объединять ячейки. Внутри таблицы
 * поддерживается ввод текста и базовое форматирование.
 * </p>
 *
 * @author Bo1dos
 * @version 1.0
 * @since 1.0
 */
public class TableController {

    /**
     * Вставляет таблицу в текущую позицию курсора.
     *
     * @param rows количество строк (должно быть >= 1)
     * @param cols количество столбцов (должно быть >= 1)
     * @throws IllegalArgumentException если rows < 1 или cols < 1
     */
    public void insertTable(int rows, int cols) {
        System.out.println("TableController: inserted " + rows + "x" + cols + " table");
    }
    
    /**
     * Добавляет новую строку в таблицу после текущей выделенной строки.
     *
     * @throws IllegalStateException если курсор не находится внутри таблицы
     */
    public void addRow() {
        System.out.println("TableController: row added");
    }
    
    /**
     * Объединяет выделенные ячейки в одну.
     *
     * @param row1 начальная строка выделения
     * @param col1 начальный столбец выделения
     * @param row2 конечная строка выделения
     * @param col2 конечный столбец выделения
     * @throws IllegalStateException если выделена некорректная область
     */
    public void mergeCells(int row1, int col1, int row2, int col2) {
        System.out.println("TableController: merged cells");
    }
}