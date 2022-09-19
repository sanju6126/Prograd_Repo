import java.util.Scanner;

import static java.lang.Math.pow;

public class squre_cube_of_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter the elements into the array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("After Operation elements are: " );
        for(int i=0;i<n;i++){
            System.out.print("Square is: " + pow(a[i],2) + " ");
            System.out.print("Cube is: " + pow(a[i],3) + " ");
            System.out.println();

        }
    }
}
