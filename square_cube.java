import java.util.Scanner;

import static java.lang.Math.pow;

public class square_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("Square of number is: "+ pow(num,2));
        System.out.println("Cube of number is: "+ pow(num,3));
    }
}
