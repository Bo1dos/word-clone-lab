package lifecycle;

/**
 * Настройки приложения.
 * <p>
 * Управляет параметрами интерфейса: цветовая тема, единицы измерения,
 * язык интерфейса. Настройки сохраняются в конфигурационном файле
 * (в реальной реализации) и восстанавливаются при следующем запуске.
 * </p>
 *
 * @author Bo1dos
 * @version 1.0
 * @since 1.0
 */
public class Settings {

    /** Текущая цветовая тема ("light", "dark", "contrast"). */
    private String theme = "light";

    /** Единицы измерения на линейках ("cm", "inch"). */
    private String unit = "cm";
    
    /**
     * Изменяет цветовую тему интерфейса.
     *
     * @param theme название темы: "light", "dark", "contrast"
     * @throws IllegalArgumentException если передано неизвестное значение
     */
    public void setTheme(String theme) {
        this.theme = theme;
        System.out.println("Settings: theme changed to " + theme);
    }
    
    /**
     * Устанавливает единицы измерения на линейках.
     *
     * @param unit "cm" (сантиметры) или "inch" (дюймы)
     * @throws IllegalArgumentException при неверном значении
     */
    public void setUnit(String unit) {
        this.unit = unit;
        System.out.println("Settings: unit changed to " + unit);
    }
    
    /**
     * Возвращает текущий язык интерфейса.
     *
     * @return код языка (например, "ru", "en")
     */
    public String getLanguage() {
        return "ru";
    }
}