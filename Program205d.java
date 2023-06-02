//Java program to input a string
import java.util.*;
public class Program205d
{
public static void main(String[] args)
{char ch;
System.out.print("enter a character:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
if(ch>='0'&&ch<='9')
System.out.println(ch+"is an digit");
else
System.out.println(ch+"is not an digit");
}
}