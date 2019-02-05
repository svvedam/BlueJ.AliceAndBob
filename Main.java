/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        String name;
       
        System.out.println("Enter the first name : ");
        name= scanner.nextLine();
        
        
        
        if ((name.equals("Alice")) || (name.equals("Bob")))
        {
        System.out.println("Greetings!!! " + name);
       
        }

    }
}
