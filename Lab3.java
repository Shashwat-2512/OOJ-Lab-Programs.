
import java.util.Scanner;

class Books{
    Scanner sc=new Scanner(System.in);
    int num_pages;
    float price;
    String name,author;
    Books(String n,String a, int num,float p)
    {
        name=n;
        author=a;
        num_pages=num;
        price=p;
        
    }
    public String toString()
    {
        return("\nName: "+name+"\nAuthor: "+author+"\nNumber of pages: "+num_pages+"\nPrice: "+price);
    }
       
    
}
public class Lab3 {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Books:  ");
        n=sc.nextInt();
        Books arr[]=new Books[n];
        for(int i=0;i<n;++i)
        {
            String name,a;
            int num;
            float p;
            System.out.println("\nEnter the name of the book "+(i+1)+": ");
            name=sc.next();
            System.out.println("Enter the name of author of the book: ");
            a=sc.next();
            System.out.println("Enter the number of pages of the book: ");
            num=sc.nextInt();
            System.out.println("Enter the price of the book: ");
            p=sc.nextFloat();
            arr[i]=new Books(name,a,num,p);
            System.out.println("Details of Book "+(i+1)+": ");
            System.out.print(arr[i]);
            
            
            
        }
    }
}
    

