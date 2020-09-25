import java.util.Scanner;
public class greatest {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>=b && a>=c)
            System.out.println(a+" is Greater");
        else if(b>=a && b>=c)
            System.out.println(b+" is greater");
        else
            System.out.println(c+" is greater");
            
            
                
                
    }
    
}
