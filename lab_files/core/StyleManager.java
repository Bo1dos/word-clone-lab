/**
 * Управление стилями оформления.
 * <p>
 * Стиль – это именованный набор параметров форматирования (шрифт, размер,
 * выравнивание и т.д.). Позволяет быстро применять согласованное оформление
 * к разным частям документа. При изменении стиля весь текст, оформленный
 * этим стилем, обновляется автоматически (в реальной реализации).
 * </p>
 *
 * @author Bo1dos
 * @version 1.0
 * @since 1.0
 */
public class StyleManager {

    /**
     * Применяет стиль к текущему абзацу (или выделению).
     *
     * @param styleName имя стиля (например, "Заголовок 1", "Обычный")
     * @throws IllegalArgumentException если стиль с таким именем не найден
     */
    public void applyStyle(String styleName) {
        System.out.println("StyleManager: applied style \"" + styleName + "\"");
    }
    
    /**
     * Создаёт новый стиль на основе заданных параметров.
     *
     * @param name       уникальное имя стиля
     * @param properties строковое представление параметров стиля
     *                   (например, "font=Arial;size=14;bold=true")
     * @throws IllegalArgumentException если стиль с таким именем уже существует
     */
    public void createStyle(String name, String properties) {
        System.out.println("StyleManager: created style \"" + name + "\"");
    }
}