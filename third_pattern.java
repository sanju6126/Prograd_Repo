import java.util.Scanner;

public class third_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        byte n = sc.nextByte();


        for(int i=n;i>0;i--){
            for(int j=n;j>=i;j--){
                System.out.print(j +" ");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i--){
            for(int j=n;j>=i;j--){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
