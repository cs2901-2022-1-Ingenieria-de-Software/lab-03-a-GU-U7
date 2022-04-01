package lab.demand;

import java.util.List;

public class ManageDemand {

    private double calculateQuantities(List<Order> orders){
        double quantities = 0.0;
        for (Order order : orders) {
            quantities += order.getQuantity();
        }
        return quantities;
    }

    private double calculateCountryTaxes(List<Order> orders, Tax tax){
        double taxes = 0.0;
        for (Order order : orders) {
            taxes += tax.calculateTax(order.getCountry());
        }
        return taxes;
    }

    public double calculateTotal(List<Order> orders){
        return calculateCountryTaxes(orders, new Tax())*calculateQuantities(orders);
    }

    public double calculateTotalForWithAdditionalByCountry(List<Order> orders, Tax tax){
        return calculateQuantities(orders)*calculateCountryTaxes(orders, tax);
    }

}
