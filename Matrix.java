import java.util.Scanner;
public class Matrix
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int rows= sc.nextInt();
         System.out.println("enter the number of columns:");
        int cols= sc.nextInt();
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        System.out.println("enter the first matrix:");
        for(int i=0;i<rows;i++)
        {
            for( int j=0;j<cols;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
            System.out.println("enter the second  matrix:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("sum of two matrices:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
               System.out.println(sum[i][j] + "");
            }
            System.out.println();
        }
        sc.close();
    }
}