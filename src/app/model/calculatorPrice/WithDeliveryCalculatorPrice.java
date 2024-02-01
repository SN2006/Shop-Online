package app.model.calculatorPrice;

import app.utils.Constants;

public class WithDeliveryCalculatorPrice implements CalculatorPrice{
    @Override
    public double calcTotalPrice(double price, int quantity) {
        return price * quantity + (price * quantity / 100 * Constants.SURCHARGE_FOR_DELIVERY);
    }
}
