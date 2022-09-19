import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float first=sc.nextFloat();
        System.out.println("Enter the second number: ");
        float second=sc.nextFloat();

        System.out.println("Addition of Two number is: "+(first+second));
        System.out.println("Subtraction of Two number is: "+(first-second));
        System.out.println("Multiplication of Two number is: "+(first*second));
        System.out.println("Division of Two number is: "+(first/second));
        System.out.println("Modulus of Two number is: "+(first%second));
    }
}
