import java.util.*;
public class Count
{
    public static void main(String[] args)
    {
        int n,p=1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the standard");
        n=sc.nextInt();
        
        if(n==1)
        {
            System.out.println("Nila gets "+p+" pencil");
        }
        
        else if((n>1)&&(n<13))
        {
        for(i=2;i<=n;i++)
        {
            p=p+(i*i);
        }
        System.out.println("Nila gets "+p+" pencils");
        }
        else
        {
            System.out.println("Invalid Standard");
        }
    }
}
