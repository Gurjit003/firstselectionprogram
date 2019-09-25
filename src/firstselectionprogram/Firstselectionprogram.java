/*
 * Gurjit Singh
 * Friday September 20th - 2019
 * This program displays the amount spent and discounts
 */
package firstselectionprogram;
import java.util.Scanner;

/**
 *
 * @author sangha
 */
public class Firstselectionprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double spent, discount, total;
    final double TEN = 0.10; // A customer spending $0.01-$40.00 will receive 10% off.
    final double TWENTY = 0.20; // A customer spending $40.01-$80.00 will receive 20% off.
    final double THIRTY = 0.30; // A customer spending $80.01-$120.00 will receive 30% off.
    final double FOURTY = 0.40; // A customer spending more than $120.00 will receive 40% off.
    
    System.out.println("Enter the amount spent and press enter."); // This asks the user to input the amount spent
    spent = input.nextDouble(); // The user will input the amount spent
    System.out.println(""); // Space
        
    if ((spent >= 0.01)||(spent <= 40.00)) { 
        discount = spent * TEN; // This calculates the discount
        total = spent - discount; // This calculates the total for the purchase
        discount = discount * 100; // Answer round up line
        discount = Math.round(discount); // Answer round up line
        discount = discount / 100; // Answer round up line
        total = total * 100; // Answer round up line
        total = Math.round(total); // Answer round up line
        total = total / 100; // Answer round up line
        System.out.println("Amount Spent: $" + spent); // This displays the amount spent
        System.out.println("Discount: 10%.0"); // This displays the discount off
        System.out.println("Discount: $" + discount); // This displays the discount
        System.out.println("Total: $" + total); // This displays the total for the purchase
        System.out.println(""); // Space
    }
    else if ((spent >= 40.01)||(spent <= 80.00)) {
        discount = spent * TWENTY; // This calculates the discount
        total = spent - discount; // This calculates the total for the purchase
        discount = discount * 100; // Answer round up line
        discount = Math.round(discount); // Answer round up line
        discount = discount / 100; // Answer round up line
        total = total * 100; // Answer round up line
        total = Math.round(total); // Answer round up line
        total = total / 100; // Answer round up line
        System.out.println("Amount Spent: $" + spent); // This displays the amount spent
        System.out.println("Discount: 20%.0"); // This displays the discount off
        System.out.println("Discount: $" + discount); // This displays the discount 
        System.out.println("Total: $" + total); // This displays the total for the purchase
        System.out.println(""); // Space
    }
    else if ((spent >= 80.01)||(spent <= 120.00)) {
        discount = spent * THIRTY; // This calculates the discount
        total = spent - discount; // This calculates the total for the purchase
        discount = discount * 100; // Answer round up line
        discount = Math.round(discount); // Answer round up line
        discount = discount / 100; // Answer round up line
        total = total * 100; // Answer round up line
        total = Math.round(total); // Answer round up line
        total = total / 100; // Answer round up line
        System.out.println("Amount Spent: $" + spent); // This displays the amount spent
        System.out.println("Discount: 30%.0"); // This displays the discount off
        System.out.println("Discount: $" + discount); // This displays the discount
        System.out.println("Total: $" + total); // This displays the total for the purchase
        System.out.println(""); // Space
    }
    else if (spent >= 120.01) {
        discount = spent * FOURTY; // This calculates the discount
        total = spent - discount; // This calculates the total for the purchase
        discount = discount * 100; // Answer round up line
        discount = Math.round(discount); // Answer round up line
        discount = discount / 100; // Answer round up line
        total = total * 100; // Answer round up line
        total = Math.round(total); // Answer round up line
        total = total / 100; // Answer round up line
        System.out.println("Amount Spent: $" + spent); // This displays the amount spent
        System.out.println("Discount: 40%.0"); // This displays the discount off
        System.out.println("Discount: $" + discount); // This displays the discount 
        System.out.println("Total: $" + total); // This displays the total for the purchase
        System.out.println(""); // Space
    }
    
  }  
}
