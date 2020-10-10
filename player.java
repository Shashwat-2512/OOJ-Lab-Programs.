
import java.util.Scanner;

class Player1
{
    int id,score,no_matches_played;
    String name;
    Player1()
    {
        System.out.println("Player obj Constructed");
    }
    
    float calculate(int score,int matches)
    {
        float avg=(float)score/matches;
        return avg;
    }
    void display(int id,String name,float avg)
    {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Average Score: "+avg);
        
    }
}
public class player {
    public static void main(String args[])
    {
        float avg;
        Scanner sc=new Scanner(System.in);
        Player1 p1=new Player1();
        System.out.println("Name: ");
        p1.name=sc.next();
        System.out.println("ID: ");
        p1.id=sc.nextInt();
        System.out.println("Score: ");
        p1.score=sc.nextInt();
        System.out.println("Matches played: ");
        p1.no_matches_played=sc.nextInt();
        avg=p1.calculate(p1.score,p1.no_matches_played);
        p1.display(p1.id, p1.name, avg);

        
    }
    
}
