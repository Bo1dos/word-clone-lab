package lifecycle;

/**
 * Предварительный просмотр и печать документа.
 * <p>
 * Позволяет увидеть, как документ будет выглядеть на бумаге,
 * и отправить его на печать. Включает настройки страницы
 * (поля, ориентация, размер бумаги).
 * </p>
 *
 * @author Bo1dos
 * @version 1.0
 * @since 1.0
 */
public class PrintPreview {

    /**
     * Открывает окно предварительного просмотра с постраничным отображением.
     */
    public void showPreview() {
        System.out.println("PrintPreview: showing page layout");
    }
    
    /**
     * Отправляет документ на печать.
     *
     * @param printerName имя принтера (если пустая строка – используется принтер по умолчанию)
     * @param copies      количество копий (должно быть >= 1)
     * @throws IllegalArgumentException если {@code copies < 1}
     */
    public void print(String printerName, int copies) {
        System.out.println("PrintPreview: printing to " + printerName + ", copies=" + copies);
    }
}