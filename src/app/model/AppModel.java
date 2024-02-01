package app.model;

import app.entity.Order;
import app.model.calculatorPrice.BasicCalculatorPrice;
import app.model.calculatorPrice.CalculatorPrice;
import app.model.calculatorPrice.WithDeliveryCalculatorPrice;

public class AppModel {

    public double calcPayment(Order order){
        CalculatorPrice calculatorPrice = getCalculatorPrice(order.getOrderStatus());
        return calculatorPrice.calcTotalPrice(order.getProduct().getPrice(), order.getQuantity());
    }

    private CalculatorPrice getCalculatorPrice(int status){
        return (status == 1) ? new BasicCalculatorPrice() : new WithDeliveryCalculatorPrice();
    }

}
