import java.util.Scanner;
public class prime {
    public static void main(String args[])
    {
    int low,high,i,flag;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    low= s.nextInt();
    high= s.nextInt();
    while (low < high) {
      flag = 0;

     
      if (low <= 1) {
         ++low;
         continue;
      }

     
      for (i = 2; i <= low / 2; ++i) {

         if (low % i == 0) {
            flag = 1;
            break;
         }
      }

      if (flag == 0)
         System.out.print(" "+low);

    
      ++low;
   }
    
    

    
    
    
}
}
