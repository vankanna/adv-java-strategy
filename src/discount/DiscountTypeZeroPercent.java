package discount;

class DiscountTypeZeroPercent implements DiscountType {

    public double applyDiscount(double bill) {
        return bill;
    }   
}