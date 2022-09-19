import java.util.Scanner;

public class digitOrAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character or number");
        char ch = sc.nextLine().charAt(0);

        if(Character.isAlphabetic(ch)){
            System.out.println("it's a character");
        }
        if(Character.isDigit(ch)){
            System.out.println("it's a number");
        }

    }
}
