package lab.demand;

public class Tax {

    private double defaultAdditionalPeru = 0.18, defaultAdditionalBrazil = 0.12, defaultAdditional = 0.0;

    public Tax(){}

    public Tax(double _defaultAdditionalColombia, double _defaultAdditionalPeru, double _defaultAdditionalBrazil){
        this.defaultAdditionalBrazil = _defaultAdditionalBrazil;
        this.defaultAdditionalPeru = _defaultAdditionalPeru;
    }

    public double calculateTax(String country) {
        if (country.equals("PE")) {
            return defaultAdditionalPeru;
        } else if (country.equals("BR")) {
            return defaultAdditionalBrazil;
        } else {
            return defaultAdditional;
        }
    }

}
