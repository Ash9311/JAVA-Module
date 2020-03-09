import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        float grade;
        System.out.println("Enter the grade point: ");
        Scanner sc= new Scanner(System.in);
        grade=sc.nextFloat();
        if((grade>=0.0)&&(grade<1.0))
        {
            System.out.println("Grade: F");
        }
        else if((grade>=1.0)&&(grade<2.0))
        {
            System.out.println("Grade: E");
        }
        else if((grade>=2.0)&&(grade<3.0))
        {
            System.out.println("Grade: D");
        }
        else if((grade>=3.0)&&(grade<4.0))
        {
            System.out.println("Grade: C");
        }
        else if((grade>=4.0)&&(grade<4.5))
        {
            System.out.println("Grade: B");
        }
        else if((grade>=4.5)&&(grade<5.0))
        {
            System.out.println("Grade: A");
        }
        else if(grade==5)
        {
            System.out.println("Grade: O");
        }
    }
}
