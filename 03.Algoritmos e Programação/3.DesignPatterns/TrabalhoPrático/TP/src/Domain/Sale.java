package Domain;

public class Sale {
    private int id;
    private String date;
    private String customerType;

    public Sale(int id, String date, String customerType) {
        this.id = id;
        this.date = date;
        this.customerType = customerType;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getCustomerType() {
        return customerType;
    }
}
