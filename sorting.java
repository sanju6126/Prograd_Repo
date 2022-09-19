import java.util.Scanner;

import static java.lang.Math.pow;

public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter the elements into the array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }


        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){

                if(a[j] > a[j+1]){

                    temp = a[j];                           //swaping the numbers after comparing
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
                else{

                    a[j] = a[j];
                }
            }
        }

        System.out.println("After sorting: ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }

    }
}
