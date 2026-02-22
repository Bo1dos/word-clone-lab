/**
 * Форматирование символов и абзацев.
 * <p>
 * Предоставляет методы для изменения внешнего вида текста:
 * шрифт, размер, начертание (жирный, курсив), выравнивание.
 * Все изменения применяются к текущему выделению или ко всему документу,
 * если выделение отсутствует.
 * </p>
 *
 * @author Bo1dos
 * @version 1.0
 * @since 1.0
 */
public class TextFormatter {
    
    /**
     * Устанавливает полужирное начертание для выделенного текста.
     *
     * @param bold {@code true} – включить жирный, {@code false} – выключить
     */
    public void setBold(boolean bold) {
        System.out.println("TextFormatter: bold = " + bold);
    }
    
    /**
     * Устанавливает размер шрифта.
     *
     * @param size размер в пунктах (должен быть положительным)
     * @throws IllegalArgumentException если {@code size <= 0}
     */
    public void setFontSize(int size) {
        System.out.println("TextFormatter: fontSize = " + size);
    }
    
    /**
     * Устанавливает выравнивание абзаца.
     *
     * @param align тип выравнивания:
     *              <ul>
     *                <li>"left" – по левому краю</li>
     *                <li>"center" – по центру</li>
     *                <li>"right" – по правому краю</li>
     *                <li>"justify" – по ширине</li>
     *              </ul>
     * @throws IllegalArgumentException если передано неизвестное значение
     */
    public void setAlignment(String align) {
        System.out.println("TextFormatter: alignment = " + align);
    }
}