package app.controller;

import app.entity.Buyer;
import app.entity.Order;
import app.entity.Product;
import app.model.AppModel;
import app.utils.Constants;
import app.utils.Rounder;
import app.view.AppView;

import java.util.List;

public class AppController {

    private final AppView view = new AppView();
    private final AppModel appModel = new AppModel();

    public void startPayment(){
        List<String> data = view.getData();
        Buyer buyer = getBuyer(data);
        Order order = getOrder(data);
        if (order.getOrderStatus() != 1 && order.getOrderStatus() != 2){
            view.printText("You have not selected the correct delivery method!");
            return;
        }
        double totalPrice = appModel.calcPayment(order);
        String answer = "\n--------------------------------------------------------" +
                "\n%s".formatted(buyer) +
                "\n%s".formatted(order) +
                "\nPayment is %s %s".formatted(Constants.CURRENCY, Rounder.roundValue(totalPrice)) +
                "\n--------------------------------------------------------";
        view.printText(answer);
    }

    private Buyer getBuyer(List<String> data){
        return new Buyer(data.get(0),data.get(1), data.get(2) );
    }

    private Order getOrder(List<String> data){
        return new Order(getProduct(data), Integer.parseInt(data.get(4)), Integer.parseInt(data.get(6)));
    }

    private Product getProduct(List<String> data) {
        return new Product(data.get(3), Double.parseDouble(data.get(5).replace(",", ".")));
    }

}
