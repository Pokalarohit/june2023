//Java program to input a string
import java.util.*;
public class Program207
{
public static void main(String[] args)
{
char ch;
System.out.println("Enter a charater:");
Scanner sc=new Scanner(System.in);
ch =sc.next().charAt(0);
int ascii_var=(int)ch;
System.out.println("ASCII of"+ch+"is"+ascii_var);
}
}
