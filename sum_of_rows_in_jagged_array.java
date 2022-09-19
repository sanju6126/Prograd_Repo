import java.util.Scanner;

public class sum_of_rows_in_jagged_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows u want: ");
        int row =  sc.nextInt();

        int [][]arr= new int[row][];     //jagged array declared

        //taking number of Columns each Row should contain
        for(int i = 0;i<row;i++) {
            System.out.println("Enter the number of columns for row " +(i+1)) ;
            int col = sc.nextInt();
            arr[i] = new int[col];
        }

        //taking entries on the rows
        for(int i =0;i< arr.length;i++)
        {
            System.out.println("Enter "+(arr[i].length)+" values in row "+ (i+1));
            for(int j =0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }


        System.out.println("sum is: ");

        int sum=0;
        for(int i =0;i< arr.length;i++)
        {   sum=0;
            for(int j =0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + "  ");
                sum+=arr[i][j];

            }
            System.out.print("->"+sum);
            System.out.println();
        }

    }
}
