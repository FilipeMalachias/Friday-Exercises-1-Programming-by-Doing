package Week1.Classes;

public class Driver {
    public static void main(String[] args) {

        Rectangle s1 = new Rectangle(5,7,"Blue");
        Rectangle s2 = new Rectangle(10, 2, "Green");
        Rectangle s3 = new Rectangle(15, 12, "Red");

        s1.draw();

        s2.draw();

        s3.draw();
    }
}