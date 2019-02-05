/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String secondName;
        System.out.println("Enter the first name : ");
        firstName= scanner.nextLine();
        System.out.println("Enter the second name : ");
        secondName = scanner.nextLine();
        
        if ((firstName.equals("Alice")) || (secondName.equals("Bob")))
        {
        System.out.println("Greetings " + firstName + " " + secondName);
       
        }

    }
}
