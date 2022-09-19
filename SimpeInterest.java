import java.util.Scanner;

public class SimpeInterest {

//    public int finalAmount(float R,float P,float T){
//        return (P(1+R*T));
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final float R= 7.5F;
        System.out.println("Enter the Amount: ");
        float P=sc.nextFloat();
        System.out.println("Enter the duration: ");
        float T=sc.nextFloat();

        System.out.println("Simple interest is: " + (P*R*T)/100);
//        System.out.println("Final Amount to be Paid is: "+ finalAmount(R,P,T));

    }

}
