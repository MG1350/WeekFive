// Maverick Guinto
// 3/13/24
// Application Name: Taxi
import java.util.Scanner;
public class Taxi
{
    public static void main (String [] args)
    {
        int pass;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of passengers: ");
        pass = input.nextInt();
        input.close();
        int cab = pass/4;
        int left = pass%4;
        System.out.println(cab + " cabs are required");
        System.out.println(left + " passengers(s) will be left over");
    }
}
