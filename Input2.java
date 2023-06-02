import  java.util.Scanner;
class Input1{
public static int add(int a,int b)
{
int c=a+b;
return c;
}
public static void sub(int a,int b)
{
int d=a-b;
return d;
}
public static void mul(int a, int b)
{
int e=a*b;
return e;
}
public static void div(int a,int b)
{
int f=a/b;
return f;
}
public static void mod(int a,int b)
{
int g=a%b;
return g;
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter a number");
int num1;
num1=scob.nextInt();
System.out.print("Enter a number:");
int num2;
num2=scob.nextInt();
System.out.println(num1+"+"+num2+"="+add(num1,num2));
System.out.println(num1+"-"+num2+"="+sub(num1,num2));
System.out.println(num1+"*"+num2+"="+mul(num1,num2));
System.out.println(num1+"/"+num2+"="+div(num1,num2));
System.out.println(num1+"%"+num2+"="+mod(num1,num2));
}//main()
}//Input1