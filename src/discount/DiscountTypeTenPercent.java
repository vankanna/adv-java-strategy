package discount;

class DiscountTypeTenPercent implements DiscountType {

    public double applyDiscount(double bill) {
        return bill - (bill * 0.1)
    }   
}