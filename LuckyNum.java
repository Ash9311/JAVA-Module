import java.util.*;
public class LuckyNum
{
    public static void main(String[] args)
    {
        int sum=0,temp,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the car no:");
         int num=sc.nextInt();
        
       if(num>999 && num<10000)
       {
       temp=num;
        while(temp>=1) 
       {
        rem=temp%10;
        sum=sum+rem;
        temp=temp/10;
       }
       
       if((sum%3==0)||(sum%5==0)||(sum%7==0))
       {
           System.out.println("Lucky Number");
       }
       else
       {
           System.out.println("Sorry its not my lucky number");
       }
       }
       else{
           System.out.println(num+" is not a valid car number");
       }
        
    }
}
