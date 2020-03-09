import java.util.*;
public class Season
{
    public static void main(String[] args)
    {
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month:");
        m=sc.nextInt();
       
        if((m==1)||(m==2)||(m==12))
        {
            System.out.println("Season:Winter");
        }
        else if(m==3||m==4||m==5)
        {
            System.out.println("Season:Spring");
        }
        else if(m==6||m==7||m==8)
        {
            System.out.println("Season:Summer");
        }
        else if(m==9||m==10||m==11)
        {
            System.out.println("Season:Autumn");
        }
        else{
            System.out.println("Invalid month");
        }
        
    }
}
