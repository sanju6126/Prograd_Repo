import java.util.Scanner;

public class Binary_to_dec_to_Binary {

    public static void dec_toBinary(int num){
        int d,sum=0,i=1;
        while(num>0){
            d = num%2;
            sum = sum + i*d;
            i = i*10;
            num = num/2;
        }

        System.out.println("Binary number is: "+ sum);
    }

    public static Boolean isBinary(int num){

        while(num!=0){
            if(num%10 > 1){
                return false;
            }
            num /=10;
        }
        return true;
    }

    public static void binary_toDecimal(int num){

        if(isBinary(num)){
            int decimal = 0;
            int n = 0;
            while(true){
                if(num == 0){
                    break;
                } else {
                    int temp = num%10;
                    decimal += temp*Math.pow(2, n);
                    num = num/10;
                    n++;
                }
            }

            System.out.println("Your Decimal number is: "+ decimal);
        }
        else{
            System.out.println("Plz Enter a valid Binary number!!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to perform Binary to Decimal and 2 to perform Decimal to Binary:" );
        System.out.println("Enter your choice: ");
        byte n = sc.nextByte();



        switch (n){
            case 1: System.out.println("Enter the Decimal number: ");
                    int num = sc.nextInt();
                    dec_toBinary(num);
                break;
            case 2: System.out.println("Enter the Binary number: ");
                int num1 = sc.nextInt();
                binary_toDecimal(num1);
                break;
            default:System.out.println("Wrong Choice!!");
        }
    }
}
