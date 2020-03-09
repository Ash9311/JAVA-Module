import java.util.*;
public class BikeRace
{
    public static void main(String[] args)
    {
        int d,j,temp,count=0,k,prodEven=1,prodOdd=1,z,bonus,i,CurrDigit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        d=sc.nextInt();
        
        if(d==0)
        {
            System.out.println("Your bonus points is 0");
        }
        
        if(d>0)
      {
            
         k=d;
         while(k>0)
         {
             k /=10;
             ++count;
         }
        
        z=count;
        for(i=1;i<=z;i++)
        {
            CurrDigit=d%10;
            if(count%2==0)
            {
                prodEven=prodEven*CurrDigit;
            }
            else{
                prodOdd=prodOdd*CurrDigit;
            }
            d=d/10;
            count--;
        }
        if(prodOdd==prodEven)
        {
            bonus=2*prodEven;
        }
        else{
            bonus=prodOdd>prodEven?prodOdd:prodEven;
        }
        System.out.println("Your bonus points is "+bonus);
        
        }
        else if(d<0)
        {
            System.out.println("Invalid Input");
        }
    }
}
