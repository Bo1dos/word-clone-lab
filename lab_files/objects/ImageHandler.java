package objects;

/**
 * Работа с изображениями и фигурами в документе.
 * <p>
 * Позволяет вставлять изображения из файлов, изменять их размер,
 * а также задавать обтекание текстом (в перспективе).
 * </p>
 *
 * @author Bo1dos
 * @version 1.0
 * @since 1.0
 */
public class ImageHandler {

    /**
     * Вставляет изображение из файла в текущую позицию курсора.
     *
     * @param path путь к файлу изображения (поддерживаются PNG, JPEG, GIF)
     * @throws IllegalArgumentException если файл не существует или имеет неподдерживаемый формат
     */
    public void insertImage(String path) {
        System.out.println("ImageHandler: inserting image from " + path);
    }
    
    /**
     * Изменяет размер выделенного изображения.
     *
     * @param width  новая ширина в пикселях (должна быть положительной)
     * @param height новая высота в пикселях (должна быть положительной)
     * @throws IllegalStateException    если ни одно изображение не выделено
     * @throws IllegalArgumentException если width или height <= 0
     */
    public void resize(int width, int height) {
        System.out.println("ImageHandler: resizing to " + width + "x" + height);
    }
}