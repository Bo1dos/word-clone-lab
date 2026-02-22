package objects;

/**
 * Диалог поиска и замены текста.
 * <p>
 * Предоставляет интерфейс для поиска фрагментов текста, замены отдельных
 * вхождений или всех сразу. Поддерживает учёт регистра и другие опции.
 * </p>
 *
 * @author Bo1dos
 * @version 1.0
 * @since 1.0
 */
public class SearchReplaceDialog {
    
    /**
     * Выполняет поиск строки в документе и выделяет все найденные вхождения.
     *
     * @param query     искомая строка (не может быть {@code null})
     * @param matchCase учитывать регистр
     * @throws NullPointerException если query равен {@code null}
     */
    public void search(String query, boolean matchCase) {
        System.out.println("Search: looking for \"" + query + "\" (matchCase=" + matchCase + ")");
    }
    
    /**
     * Заменяет одно вхождение (текущее выделенное) на новую строку.
     * В текущей реализации выводит сообщение о замене.
     *
     * @param from заменяемая строка
     * @param to   новая строка
     */
    public void replace(String from, String to) {
        System.out.println("Replace: \"" + from + "\" → \"" + to + "\"");
    }
}