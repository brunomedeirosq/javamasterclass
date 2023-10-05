public class Rectangle {

    //instance variables
    private double width;
    private double length;

    //class constructor
    public Rectangle(double width, double length) {
        if (width < 0) {
            width = 0;
        }
        if (length < 0) {
            length = 0;
        }
        this.width = width;
        this.length = length;
    }

    //instance methods
    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public double getArea(){
        return width*length;
    }

}
