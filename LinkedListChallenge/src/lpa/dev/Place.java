package lpa.dev;

public class Place {

    private String town;
    private int distance;

    public Place(String town, int distance) {
        this.town = town;
        this.distance = distance;
    }

    public String getTown() {
        return town;
    }

    public int getDistance() {
        return distance;
    }

    public String print() {
        return (getTown() + " --> " + getDistance() + "km");
    }
}
