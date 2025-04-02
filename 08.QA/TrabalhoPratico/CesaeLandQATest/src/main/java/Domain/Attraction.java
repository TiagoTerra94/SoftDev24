package Domain;

public class Attraction {
    private int id;
    private String atraction;
    private double adultPrice;
    private double childPrice;
    private int seconds;

    public Attraction(int id, String atraction, double adultPrice, double childPrice, int seconds) {
        this.id = id;
        this.atraction = atraction;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
        this.seconds = seconds;
    }

    public int getId() {
        return id;
    }

    public String getAtraction() {
        return atraction;
    }

    public double getAdultPrice() {
        return adultPrice;
    }

    public double getChildPrice() {
        return childPrice;
    }

    public int getSeconds() {
        return seconds;
    }
}
