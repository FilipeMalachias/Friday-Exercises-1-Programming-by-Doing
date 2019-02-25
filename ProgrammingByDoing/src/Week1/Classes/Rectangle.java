package Week1.Classes;

public class Rectangle {
    private String color;
    private int width, heigth;

    public Rectangle(int width, int heigth, String color) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
        }
        if (heigth > 0) {
            this.heigth = heigth;
        } else {
            this.heigth = 1;
        }
        setColor(color);
    }
    //getter

    public int getHeigth() {
        return heigth;
    }

    public int getWidth() { return width; }

    public String getColor() {
        return color;
    }

    // setter
    public final void setColor(String color) {
        if (color.length() >= 2 && color.length() <= 20) {
            this.color = color;
        } else {
            this.color = "Blue";
        }
    }


    //----------------------------------------------------------------------------------------------------------------------
    public void draw() {
        String paintColor = this.color.substring(0, 2).toUpperCase();
        for (int row = 0; row < this.width; row++) {
            for(int col = 0; col < this.heigth; col++) {
                System.out.print(paintColor + " ");
            }
            System.out.println();
        }
    }
}