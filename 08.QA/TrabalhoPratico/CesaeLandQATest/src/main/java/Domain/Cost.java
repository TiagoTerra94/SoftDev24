package Domain;

public class Cost {
    private int id;
    private double ticketMaintanance;
    private double costFixed;

    public Cost(int id, double ticketMaintanance, double costFixed) {
        this.id = id;
        this.ticketMaintanance = ticketMaintanance;
        this.costFixed = costFixed;
    }

    public int getId() {
        return id;
    }

    public double getTicketMaintanance() {
        return ticketMaintanance;
    }

    public double getCostFixed() {
        return costFixed;
    }
}
