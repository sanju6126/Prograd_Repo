import java.util.Scanner;

public class thirdAngleOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first angle of Triangle: ");
        float first=sc.nextFloat();
        System.out.println("Enter the second angle of Triangle: ");
        float second=sc.nextFloat();
        System.out.println("Third angle of Trianle is: "+ (180-(first+second))+"degree");
    }
}
