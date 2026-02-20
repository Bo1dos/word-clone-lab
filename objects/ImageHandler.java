package objects;

public class ImageHandler {
    public void insertImage(String path) {
        System.out.println("ImageHandler: inserting image from " + path);
    }
    
    public void resize(int width, int height) {
        System.out.println("ImageHandler: resizing to " + width + "x" + height);
    }
}