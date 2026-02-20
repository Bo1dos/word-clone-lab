package lifecycle;

public class Settings {
    private String theme = "light";
    private String unit = "cm";
    
    public void setTheme(String theme) {
        this.theme = theme;
        System.out.println("Settings: theme changed to " + theme);
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
        System.out.println("Settings: unit changed to " + unit);
    }
    
    public String getLanguage() {
        return "ru";
    }
}
