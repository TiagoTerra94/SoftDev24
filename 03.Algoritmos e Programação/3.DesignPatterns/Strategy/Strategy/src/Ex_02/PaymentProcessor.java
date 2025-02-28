package Ex_02;

public class PaymentProcessor {
    private DiscountStrategy selectedDiscount;

    public PaymentProcessor(DiscountStrategy selectedDiscount) {
        this.selectedDiscount = selectedDiscount;
    }

    public void setSelectedDiscount(DiscountStrategy selectedDiscount){
        this.selectedDiscount = selectedDiscount;
    }

    public double calculateTotal(int value){

    }

}
