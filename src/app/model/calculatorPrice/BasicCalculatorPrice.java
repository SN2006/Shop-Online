package app.model.calculatorPrice;

public class BasicCalculatorPrice implements CalculatorPrice{
    @Override
    public double calcTotalPrice(double price, int quantity) {
        return price * quantity;
    }
}
