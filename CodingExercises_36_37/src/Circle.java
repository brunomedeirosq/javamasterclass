public class Circle {

    //instance variables
    private double radius;

    //constructor with one argument
    public Circle (double radius){
        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    //instance methods
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

}
