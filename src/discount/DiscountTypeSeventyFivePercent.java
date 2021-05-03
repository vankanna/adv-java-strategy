package discount;

class DiscountTypeSeventyFivePercent implements DiscountType {

    public double applyDiscount(double bill) {
        return bill - (bill * 0.75)
    }   
}