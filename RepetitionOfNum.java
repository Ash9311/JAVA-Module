import java.util.*;
public class NumberRepetition
{
    public static void main(String[] args)
    {
        int num,temp,key,flag=0,count=0,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        num=sc.nextInt();
        System.out.println("Enter the key digit ");
        key=sc.nextInt();
        
        temp=num;
        while(temp>0)
        {
            k=temp%10;
            if(k==key)
            {
                count=count+1;
            }
            else
            {
                flag=0;
                
            }
            temp=temp/10;
        }
        System.out.println(key+" appears "+count+" times in "+num);
    }
}
