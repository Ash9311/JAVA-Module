import java.util.*;
public class PrimeNumbers
{
    public static void main(String[] args)
    {
        int a,b,i,flag=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        
       
        if((a<b)&&(a>0))
        {
            if((a==2)||(a==1))
            {
                System.out.print("2 ");
            }
            for(i=a;i<=b;i++)
            {
               //for(j=2;j<i;j++)
               int j=2;
                while(j<i)
                {
                    if((i%j)==0)
                    {
                        flag=0;
                        break;
                    }
                    else{
                        flag=1;
                    }
                    j=j+1;
                }
                
                if(flag==1)
                {
                    System.out.print(i+" ");
                }
                
                
            }
        }
        else{
            System.out.println("Provide valid input");
        }
    }
}
