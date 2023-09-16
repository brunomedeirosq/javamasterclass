public class Point {

    //instance fields/variables
    private int x;
    private int y;

    //constructor no-args
    public Point() {

    }

    //constructor with both arguments
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //methods
    public double distance() {
        return distance(0,0);
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2));
    }

    public double distance(Point p) {
        return distance(p.getX(),p.getY());
    }


}
