package lab;

import lab.demand.Tax;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaxTest {

    public static Tax getDefaultTax(){ return new Tax();}

    public static Tax getCustomTax(){return new Tax(0.5, 0.3, 0.9);}

}
