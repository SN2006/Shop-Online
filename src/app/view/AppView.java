package app.view;

import app.utils.Constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppView {

    private final Scanner scanner = new Scanner(System.in);

    public List<String> getData(){
        System.out.println("Enter your name: ");
        String buyerName = scanner.nextLine().trim();
        System.out.println("Enter your phone: ");
        String buyerPhone = scanner.nextLine().trim();
        System.out.println("Enter your email: ");
        String buyerEmail = scanner.nextLine().trim();
        System.out.println("Enter product name: ");
        String productName = scanner.nextLine().trim();
        System.out.println("Enter product quantity, pcs.: ");
        String productQuantity = scanner.nextLine().trim();
        System.out.printf("Enter product price, %s: %n", Constants.CURRENCY);
        String productPrice = scanner.nextLine().trim();
        System.out.println("Select delivery method: " +
                "\n1 - Without delivery" +
                "\n2 - Delivery is carried out by the company (delivery cost %d%% of the order value)"
                        .formatted(Constants.SURCHARGE_FOR_DELIVERY));
        String deliveryStatus = scanner.nextLine().trim();
        return new ArrayList<>(Arrays.asList(buyerName, buyerPhone, buyerEmail,
                productName, productQuantity, productPrice, deliveryStatus));
    }

    public void printText(String text){
        System.out.println(text);
    }

}
