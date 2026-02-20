public class StyleManager {
    public void applyStyle(String styleName) {
        System.out.println("StyleManager: applied style \"" + styleName + "\"");
    }
    
    public void createStyle(String name, String properties) {
        System.out.println("StyleManager: created style \"" + name + "\"");
    }
}