import java.util.*;
public class Placement
{
    public static void main(String[] args)
    {
        int c,e,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        c=sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        e=sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        m=sc.nextInt();
      
     
     if((c>=0)&&(e>=0)&&(m>=0))
     {
      
        if((c+e+m==0)|((c==e)&&(e==m)))
        {
            System.out.println("None of the department has got the highest placement");
            
        }
        
        if(!((c==e)&&(e==m))){
        if((c+e+m)>0){
        System.out.println("Highest placement");
        
        if(c>e && c>m)
        {
            System.out.println("CSE");
        }
        else if (e>c && e>m)
        {
            System.out.println("ECE");
        }
        else if(m>c && m>e)
        {
            System.out.println("MECH");
        }
        //else if(c==e && e==m)
       // {
        //    System.out.print("CSE\nECE\nMECH");
       // }
        else if(c==e)
        {
            System.out.println("CSE\nECE");
        }
        else if(e==m)
        {
            System.out.println("ECE\nMECH");
        }
        else if(c==m)
        {
            System.out.println("CSE\nMECH");
        }
        }
        }
        
     }
     else
     System.out.println("Input is Invalid");
    }
}
