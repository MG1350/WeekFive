import java.util.Scanner;
import java.text.NumberFormat;
public class Sleep 
{
    public static void main (String [] args)
    {
        int year;
        int month;
        int day;
        int Cyear;
        int Cmonth;
        int Cday;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthdate: ");
        System.out.print("Year: ");
        year = input.nextInt();
        System.out.print("Month: ");
        month = input.nextInt();
        System.out.print("Day: ");
        day = input.nextInt();
        System.out.println("Enter today's date: ");
        System.out.print("Year: ");
        Cyear = input.nextInt();
        System.out.print("Month: ");
        Cmonth = input.nextInt();
        System.out.print("Day: ");
        Cday = input.nextInt();
        System.out.println(year +"/"+ month + "/" + day + " " + Cyear + "/" + Cmonth + "/" + Cday);

        
    }
}
