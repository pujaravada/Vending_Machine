import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by Puja on 3/20/17.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

    /* Assumption: 1) There is an unlimited supply of Sodas in the machine
                   2) The machine takes 2 payment types - Cash & Card - Credit/Debit
                   3) You have to insert the exact cash for cash payment
    * **/

        System.out.println("Choose a product: Coke, Pepsi, Fanta, Soda" );
        System.out.println("Your selection : " );
        Scanner sc =  new Scanner(System.in);
        String selectedProduct = sc.next();

        // Return product object with name and price
        Products products = Products.valueOf(selectedProduct.toUpperCase());

        // Return price of selected product
        double productPrice = products.getPrice();
        System.out.println("You owe:" +productPrice);

        //Pick a payment method
        System.out.println("Pick a payment method: Cash or Card");
        System.out.println("Enter 'Cash' or 'Card' : ");

        String paymentMethod = sc.next();

        // If you want to pay with cash
        if(paymentMethod.equalsIgnoreCase("cash")){
            System.out.println("Insert exact cash");
            double cashInserted = sc.nextDouble();

            if(cashInserted == productPrice){
                System.out.println("Dispensed - " +selectedProduct);
            }
            if(cashInserted<productPrice){
                System.out.println("Insufficient Funds");

            }
            if(cashInserted>productPrice){
                System.out.println("Excess Funds/cannot return change");
                System.out.println("Dispensed - " +selectedProduct);

            }
        }

        // If you want to pay with card
        if(paymentMethod.equalsIgnoreCase("card")){
            System.out.println("Insert card");
            System.out.println("Enter Zipcode");
            int zipcode = sc.nextInt();
            //Card validation goes here
            System.out.println("Validating card....");

            TimeUnit.SECONDS.sleep(5);

            System.out.println("Dispensed - " +selectedProduct);
        }
    }
}

