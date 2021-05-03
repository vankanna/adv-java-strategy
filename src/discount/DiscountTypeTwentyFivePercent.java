package discount;

class DiscountTypeTwentyFivePercent implements DiscountType {

    public double applyDiscount(double bill) {
        return bill - (bill * 0.25)
    }   
}