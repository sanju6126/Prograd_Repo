import java.util.Arrays;
import java.util.Scanner;

public class second_Largest_element {

//this Program is for Kth Largest
    public static String solveFor2(int[] a, int n, int k){

        if(k>n){
            return "Invalid value of K!!";
        }

        int x=1;  int item=1;

        for(int i=n-1;i>=0;i--){
            if(a[i]!=a[n-item]){
//                x++;
                item++;   //found new item
                if(item == k){
                    return  Integer.toString(a[i]);
                }
            }
            else{   //equal hai condition
                if(item==k){
                    return Integer.toString(a[i]);
                }
                continue;
            }
        }

            return "nth highest can't be found, input  different integers";

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter the elements into the array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        Arrays.sort(a);
//        if(n==1){
//            System.out.println("No second element is there!! Plz change the Size of the Array");
//        }
//        else{
//            System.out.println("Output ==>: "+ solveFor2(a,n,k));
//        }
        System.out.println("Output ==>: "+ solveFor2(a,n,k));     //above commented part works here as well without putting the If condition
    }
}

//                                                                                                                                    item=1 we have allready found 1 number
//chota to hoga obviously ....i just have to check whether the numbers are equal...if they are equal just skip and don't increment the item val.....if they are not equal u found another number so, increment item val by 1