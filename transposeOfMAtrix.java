import java.util.Scanner;

public class transposeOfMAtrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter details of Matrtix A: ");
        System.out.println("Enter the number of rows");
        int rowA = sc.nextInt();
        System.out.println("Enter the number of columns");
        int colA = sc.nextInt();

        int [][]A = new int[rowA][colA];
        int [][]B = new int[rowA][colA];

        if((rowA == colA) ){
            System.out.println("Enter the elements in to Matrix A");
            for(int i=0;i<rowA;i++){
                for(int j=0;j<colA;j++){
                    A[i][j] = sc.nextInt();
                }
            }

            ///logic
            System.out.println("Calculated matrix is: ");
            for(int i=0;i<rowA;i++){
                for(int j=0;j<colA;j++){
                    System.out.print(B[i][j] = A[j][i]);
                    System.out.print(" ");
                }
                System.out.println();
            }



        }
        else{
            System.out.println("Enter the same number of Rows and Columns ");
        }


    }
}
