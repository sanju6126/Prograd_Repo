import java.util.Scanner;

import static java.lang.Math.pow;

public class profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost price: ");
        float cost=sc.nextFloat();
        System.out.println("Enter the selling price: ");
        float selling=sc.nextFloat();
        System.out.println("Your Profit is: "+(selling-cost));
    }
}
