import java.util.Scanner;
public class grade {
    public static void main(String args[])
    {
        int cie1,cie2,see,fm;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter cie1 marks: ");
        cie1=s.nextInt();
        System.out.println("Enter cie2 marks: ");
        cie2=s.nextInt();
        System.out.println("Enter see marks: ");
        see=s.nextInt();
        fm=(cie1/2)+(cie2/2)+(see/2);
        if(fm>=90 && fm<=100)
            System.out.println("S grade");
        else if(fm>=80 && fm<90)
            System.out.println("A grade");
        else if(fm>=70 && fm<80)
            System.out.println("B grade");
        else if(fm>=60 && fm<70)
            System.out.println("C grade");
        else if(fm>=40 && fm<60)
            System.out.println("E grade");
        else if(fm>=0 && fm<40)
            System.out.println("F grade");
        else
            System.out.println("Wrong input");
    }
}
