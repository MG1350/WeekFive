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
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat number = NumberFormat.getIntegerInstance();
        NumberFormat decimal = NumberFormat.getNumberInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
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
        input.close();
        System.out.println(year +"/"+ month + "/" + day + " " + Cyear + "/" + Cmonth + "/" + Cday);
        int Pdays = year * 365 + month * 30 + day;
        int Cdays = Cyear * 365 + Cmonth * 30 + Cday;
        int Ddays = Cdays - Pdays;
        System.out.println("You have been alive for " + decimal.format(Ddays) + " days");
        System.out.println("You have slept for " + decimal.format(Ddays*8) + " hours");
    }
}
