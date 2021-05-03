package discount;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<CustomerOrder> orders = new ArrayList<>();
        DiscountType tenPercent = new DiscountTypeTenPercent();
        DiscountType twentyFiverPercent = new DiscountTypeTwentyFivePercent();
        DiscountType seventyFivePercent = new DiscountTypeSeventyFivePercent();
        DiscountType zeroPercent = new DiscountTypeZeroPercent();

        //Discount types S for Sale, D for Discount, L for Liquidation
        orders.add(new CustomerOrder("William Walters", 75.34, tenPercent));
        orders.add(new CustomerOrder("Susan Smothers", 24.12, twentyFiverPercent));
        orders.add(new CustomerOrder("Jessica Johnson", 273.93, seventyFivePercent));
        orders.add(new CustomerOrder("Richard Ricardo", 171.42, zeroPercent));

        double total = 0;
        for (CustomerOrder order : orders) {
            System.out.printf("%-20s $%7.2f\n", order.getCustomerName(), order.getBillAmount());
            total += order.getBillAmount();
        }

        System.out.printf("%-20s $%7.2f", "Total: ", total);
    }
}
