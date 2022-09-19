import java.util.Scanner;

public class unicode_values {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character");
        byte num = (byte)sc.next().charAt(0);

        System.out.println(num);
    }


}
