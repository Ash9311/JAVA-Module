import java.util.Scanner;
class SnacksDetails
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int z,p,c,t,pizzas,puffs,cooldrinks;
        System.out.println("Enter the no of pizzas bought:");
        pizzas=sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        puffs=sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        cooldrinks=sc.nextInt();
    
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pizzas);
        System.out.println("No of puffs:"+puffs);
        System.out.println("No of cooldrinks:"+cooldrinks);
        
        z=(100*pizzas);
        p=(20*puffs);
        c=(10*cooldrinks);
        t=z+p+c;
        System.out.println("Total price="+t);
        System.out.println("ENJOY THE SHOW!!!");
    }
}
