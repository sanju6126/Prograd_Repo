import java.util.Scanner;

public class days_into_months {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the count of number of days: ");
        int days = sc.nextInt();

        int months=0;
        months = days/30;
        days = days%30;

        System.out.println(months +" months " + days +" days");

    }
}
