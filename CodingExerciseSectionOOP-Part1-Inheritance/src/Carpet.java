public class Carpet {

    //instance field or variable
    private double cost;

    //instance constructor
    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else this.cost = cost;
    }

    //instance methods
    public double getCost() {
        return cost;
    }


}
