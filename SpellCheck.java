import java.util.*;

public class Character{
    
    public static void main(String[] args)
    {
        String h;
        String i="RAINBOW";
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first letter:");
        String a=sc.nextLine();
        System.out.println("Enter the second letter:");
        String b=sc.nextLine();
        System.out.println("Enter the third letter:");
        String c=sc.nextLine();
        System.out.println("Enter the fourth letter:");
        String d=sc.nextLine();
        System.out.println("Enter the fifth letter:");
        String e=sc.nextLine();
        System.out.println("Enter the sixth letter:");
        String f=sc.nextLine();
        System.out.println("Enter the seventh letter:");
        String g=sc.nextLine();
        
        h=a+b+c+d+e+f+g;
        
        if(h.equals(i))
        {
            System.out.println("RAINBOW");
        }
        else
        {
            System.out.println("The spelling is wrong");
        }
       
        
        
}
    
}
