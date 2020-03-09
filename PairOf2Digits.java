import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int i,j,rev1=0,a,b,digit1,digit2,rev2=0;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        i=a;
        while(i>0)
        {
            digit1=i%10;
            rev1=(rev1*10)+digit1;
            i=i/10;
        }
        j=b;
        while(j>0)
        {
            digit2=j%10;
            rev2=(rev2*10)+digit2;
            j=j/10;
        }
        if((a*b)==(rev1*rev2))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
