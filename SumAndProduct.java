import java.util.*;

public class Main
{
    // public static int reverse(int a,b)
    // {
    //     while(int num!=0)
    //     {
    //       int digit=num%10;
    //         int reversed=reversed*10 + digit;
    //       int num=num/10;
    //     }
    //     return reversed;
        
    // }
    
    public static void main (String[] args) {
        
    int a,b,revProd=0,temp,sum,product,digit;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    if(a>0)
    {
    b=sc.nextInt();
    if(b>0)
    {
    sum=a+b;
    product=a*b;
    temp=product;
    while(temp!=0)
    {
        digit=temp%10;
        revProd=revProd*10+digit;
        temp=temp/10;
        
    }
    if(sum==revProd)
    {
        System.out.println("You are Lucky! Here Is your Gift.");
    }
    else
        System.out.println("Better Luck Next Time");
    }
    else{
        System.out.println("Invalid Input");
    }
    }
    
    else
    {
    System.out.println("Invalid Input");
    }
    }

    }
    
