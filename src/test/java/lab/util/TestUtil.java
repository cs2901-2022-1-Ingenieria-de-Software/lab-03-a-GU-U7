package lab.util;

import java.util.List;
import java.util.ArrayList;

import lab.demand.Order;

public class TestUtil {

    public static List<Order> buildOrdersPeru() {
        List<Order> ordersPeru = new ArrayList<Order>();
        ordersPeru.add(new Order("PE", 10L));
        ordersPeru.add(new Order("PE", 10L));
        return ordersPeru;
    }

    public static List<Order> buildOrdersColombia() {
        List<Order> ordersPeru = new ArrayList<Order>();
        ordersPeru.add(new Order("CO", 10L));
        ordersPeru.add(new Order("CO", 10L));
        return ordersPeru;
    }

    public static List<Order> buildEmptyOrders(){
        List<Order> orders = new ArrayList<Order>();
        orders.add(new Order("", 10L));
        orders.add(new Order("", 20L));
        orders.add(new Order("", 105L));
        return orders;
    }

}