import java.util.Scanner;

import static java.lang.Math.pow;

public class meterToKilometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length in meters: ");
        int num=sc.nextInt();
        System.out.println((float) num/1000 +"Kilometers");
    }
}
