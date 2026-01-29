import java.util.Scanner;
public class Sym
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int rows= sc.nextInt();
         System.out.println("enter the number of columns:");
        int cols= sc.nextInt();
        if(rows!=cols)
        {
            System.out.println("Not symmetric and not square");
            return;
        }
        int[][] a=new int[rows][cols];
        System.out.println("enter the  matrix:");
        for(int i=0;i<rows;i++)
        {
            for( int j=0;j<cols;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        boolean symmetric=true;
        for(int i=0;i<rows;i++)
        {
            for( int j=0;j<cols;j++)
            {
                if (a[i][j] != a[j][i])
                {
                    symmetric=false;
                    break;
                }
            }
        }
        if(symmetric)
        {
            System.out.println("the matrix is symmetric");
        }
        else
        {
             System.out.println("the matrix is  not symmetric");
        }
    }
}