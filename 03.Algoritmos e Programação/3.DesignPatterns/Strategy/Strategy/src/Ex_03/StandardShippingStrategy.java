package Ex_03;

public class StandardShippingStrategy implements ShippingStrategy{

    public StandardShippingStrategy() {
    }

    @Override
    public double calculateShippingCost(double packageWeight) {
        return packageWeight*5.0;
    }
}
