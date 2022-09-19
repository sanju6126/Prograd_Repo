import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Percentage");
        float percent = sc.nextFloat();

        System.out.println((percent>=40)?"your are pass":"you are fail");
    }
}
