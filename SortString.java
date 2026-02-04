import java.util.Arrays;
import java.util.Scanner;
class SortString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string :");
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        String sortedstr= new String(ch);
        System.out.println("sorted string :"+sortedstr);
    }
}