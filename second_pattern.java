import java.util.Scanner;

public class second_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        byte n = sc.nextByte();


        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
