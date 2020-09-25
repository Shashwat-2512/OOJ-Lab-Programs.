
import java.util.Scanner;


public class increment {
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=s.nextInt();
        for(int i=0;i<n;++i)
        System.out.print((i+1)+" ");
        
    }
}
