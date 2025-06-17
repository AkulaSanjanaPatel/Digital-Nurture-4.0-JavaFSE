public class Test {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image_1.jpg");
        image.display(); 
        System.out.println("");
        image.display(); 
        System.out.println("");
    }
}
