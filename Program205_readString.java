//Java program to input a string
import java.util.*;
public class Program205_readstring
{
public static void main(String[] args)
{
System.out.print("enter your name:");
Scanner sc=new Scanner(System.in);
String n=sc.next();
char ch=n.charAt(0);
System.out.println("Welcom"+n+ch);
}
}