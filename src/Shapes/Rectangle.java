package Shapes;
public class Rectangle {
    private int width;
    private int length;

    public void setWidth(int width) {
        this.width = width;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int Area(int width, int length) {
        return (length*width);
    }
    public int Cirumferemce(int width, int length) {
      return 2*(length*width);
    }

}

