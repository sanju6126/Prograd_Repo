import java.util.Scanner;

public class adding_2_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter details of Matrtix A: ");
        System.out.println("Enter the number of rows");
        int rowA = sc.nextInt();
        System.out.println("Enter the number of columns");
        int colA = sc.nextInt();

        int [][]A = new int[rowA][colA];


        System.out.println("Enter details of Matrtix b: ");
        System.out.println("Enter the number of rows");
        int rowB = sc.nextInt();
        System.out.println("Enter the number of columns");
        int colB = sc.nextInt();

        int [][]B = new int[rowB][colB];
        int [][]C = new int[rowA][colA];

        if((rowA == rowB) && (colA==colB)){
            System.out.println("Enter the elements in to Matrix A");
            for(int i=0;i<rowA;i++){
                for(int j=0;j<colA;j++){
                    A[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the elements in to Matrix B");
            for(int i=0;i<rowB;i++){
                for(int j=0;j<colB;j++){
                    B[i][j] = sc.nextInt();
                }
            }



            ///performing addition
            System.out.println("Calculated matrix is: ");
            for(int i=0;i<rowA;i++){
                for(int j=0;j<colA;j++){
                    System.out.print(C[i][j] = A[i][j] + B[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }

            ///performing subtraction
            System.out.println("Calculated matrix is: ");
            for(int i=0;i<rowA;i++){
                for(int j=0;j<colA;j++){
                    System.out.print(C[i][j] = A[i][j] - B[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }




            //displaying

//            for(int i=0)




        }
        else{
            System.out.println("Enter the same number of Rows and Columns for each Matrix");
        }





    }
}
