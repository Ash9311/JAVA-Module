import java.util.*;
public class CelsiusConversion
{
    float c,f,a;
    public static void main(String[] args)
    {
        double c,f,a;
        Scanner sc=new Scanner(System.in);
        c=sc.nextDouble();
        a=(1.8*c);
        f=32+a;
        System.out.format("%.1f",f);
    }
}
