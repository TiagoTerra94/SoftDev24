package Ex_03;

public class OvernightShippingStrategy implements ShippingStrategy{

    public OvernightShippingStrategy() {
    }

    @Override
    public double calculateShippingCost(double packageWeight) {
        return packageWeight*15.0;
    }
}
