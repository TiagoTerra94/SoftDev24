package Ex_03;

public class ExpressShippingStrategy implements ShippingStrategy{

    public ExpressShippingStrategy() {
    }

    @Override
    public double calculateShippingCost(double packageWeight) {
        return packageWeight*10.0;
    }
}
