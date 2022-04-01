package lab;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import lab.demand.ManageDemand;
import lab.demand.Tax;
import lab.util.TestUtil;
import lab.demand.Order;

import java.util.ArrayList;
import java.util.List;

@Test
public class ManageDemandTest {

    private Tax tax;

    private ManageDemand demand;

    @BeforeClass
    public void setup() {
        tax = new Tax();
        demand =  new ManageDemand();
    }

    @Test
    public void test_AllOrdersFromPeru() {
        List<Order> ordersFromPeru = TestUtil.buildOrdersPeru();
        double result = demand.calculateTotal(ordersFromPeru);
        Assert.assertEquals(Math.round(result), 7.0);
    }

    @Test
    public void test_PeruOrdersCustokm(){
        List<Order> ordersFromPeru = TestUtil.buildOrdersPeru();
        double result = demand.calculateTotalForWithAdditionalByCountry(ordersFromPeru, TaxTest.getCustomTax());
        Assert.assertEquals(Math.round(result),12);
    }

    @Test
    public void test_EmptyList(){
        List<Order> emptyList = new ArrayList<Order>();
        double result = demand.calculateTotal(emptyList);
        Assert.assertEquals(Math.round(result), 0);
    }

}
