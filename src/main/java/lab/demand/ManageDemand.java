package lab.demand;

import java.util.List;

public class ManageDemand {

    private double calculateTaxes(List<Order> orders){
        double taxes = 0.0;
        for (Order order : orders) {
            taxes += (new Tax()).calculateTax(order.getCountry());
        }
        return taxes;
    }

    private double calculateQuantities(List<Order> orders){
        double quantities = 0.0;
        for (Order order : orders) {
            quantities += order.getQuantity();
        }
        return quantities;
    }

    public double calculateTotal(List<Order> orders){
        return calculateTaxes(orders)*calculateQuantities(orders);
    }

    private double calculateCountryTaxes(List<Order> orders, Tax tax){
        double taxes = 0.0;
        for (Order order : orders) {
            taxes += tax.calculateTax(order.getCountry());
        }
        return taxes;
    }

    public double calculateTotalForWithAdditionalByCountry(List<Order> orders, Tax tax){
        return calculateQuantities(orders)*calculateCountryTaxes(orders, tax);
    }

}
