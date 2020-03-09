import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        double c,h,u,s;
        float amount;
        String code;
        String i="CAD",j="HKD",k="USD",l="SGD";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the currency code");
        code=sc.nextLine();
        if((code.equals(i))||(code.equals(j))||(code.equals(k))||(code.equals(l)))
        {
        System.out.println("Enter the amount");
        amount=sc.nextFloat();
        //String str=String.format("%.02f", amount);
        
        if(code.equals(i))
        {
            c=(amount*52.08);
            String str=String.format("%.02f",amount);
            
            System.out.format("Canada dollar %.0f equals to %.2f Indian Rupee",amount,c);
        }
        else if(code.equals(j))
        {
            h=(amount*8.86);
            
            System.out.format("Hong Kong dollar %.0f equals to %.2f Indian Rupee",amount,h);
        }
        else if(code.equals(k))
        {
            u=(amount*69.55);
            System.out.format("USA dollar %.0f equals to %.2f Indian Rupee",amount,u);
         //   System.out.println("USA dollar "+amount+" equals to "+u+" Indian Ruppee");
        }
        else if(code.equals(l))
        {
            s=(amount*51.29);
            System.out.format("Singapore dollar %.0f equals to %.2f Indian Rupee",amount,s);
        }
        }
        else
        {
            System.out.println("Currency code not found");
        }
        
        
    }
}
