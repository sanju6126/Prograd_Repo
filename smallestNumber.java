import java.util.Scanner;

public class smallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number");
        int num1 = sc.nextInt();
        System.out.println("Enter the first Number");
        int num2 = sc.nextInt();

        System.out.println("smallest number is: "+ ((num1>num2)?num2:num1));

    }
}
