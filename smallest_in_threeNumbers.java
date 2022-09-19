import java.util.Scanner;

import static sun.swing.MenuItemLayoutHelper.max;

public class smallest_in_threeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number");
        int a = sc.nextInt();
        System.out.println("Enter the second Number");
        int b = sc.nextInt();
        System.out.println("Enter the third Number");
        int c = sc.nextInt();

//        int mx = max(a,b,c);
//        int mn = min(a,b,c);

        if(a>b){
            if(c>a){
                System.out.println("c is the biggest and b is the smallest");
            }
            else if(b>c){
                System.out.println("a is the biggest and c is the smallest");
            }
            else{
                System.out.println("a is the biggest and b is the smallest");            }
        }
        else if(b>c){
            if(a<c){
                System.out.println("b is the biggest and a is the smallest");
            }
            else{
                System.out.println("b is the biggest and c is the smallest");
            }
        }
        else{
            System.out.println("c is the biggest and a is the smallest");
        }

    }
}
