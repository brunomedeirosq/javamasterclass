public class Floor {

    //instance variables or instance fields
    private double width;
    private double length;

    //constructor to initialize instances of class Floor (objects)
    public Floor(double width, double length) {
        if (width < 0) {
            this.width=0;
        } else this.width=width;
        if (length < 0) {
            this.length=0;
        } else this.length=length;
    }

    //instance methods
    public double getArea() {
        return width*length;
    }

}
