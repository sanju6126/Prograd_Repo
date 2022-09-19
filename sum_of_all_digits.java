import java.util.Scanner;

public class sum_of_all_digits {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//
//        int sum=0;
//        int rem1 =num%10;
//            num = num/10;
//        sum =  (sum +rem1);
//            rem1 = num%10;
//            num = num/10;
//        sum =  (sum +rem1);
//            rem1 = num%10;
//        sum =  (sum +rem1);
//
//
////        int sum=0;int rem=0;
////        while(num!=0){
////            rem = num%10;
////            sum += rem;
////
////            num = num/10;
////        }
//
//        System.out.println("sum of all digits are: "+sum);
//
//    }



//RECURSION APPROACH:
    public static int sum(int num){
        if(num<=0){
            return 0;
        }
//        int mod = num%10;
//        num /=10;

        return num%10+sum(num/10);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println(sum(num));
    }


}
