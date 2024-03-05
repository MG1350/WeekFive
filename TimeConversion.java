import java.util.Scanner;
public class TimeConversion 
{
    public static void main (String [] args)
    {
        int timeB;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a time in mnutes: ");
        timeB = input.nextInt();
        input.close();
        int timeBL = (timeB % 60);
        int minutes = timeB;
        timeB = timeB /60;
        if (timeBL < 9)
        {
            System.out.println("The time is: " + timeB + ":0" + timeBL);
            System.out.println("Check " + (timeB * 60) + " minutes"+ " (" + timeB + " hours) " + timeBL + " minutes = " + ((timeB*60)+timeBL));
        } 
        else
        {
            System.out.println("The time is: " + timeB + ":" + timeBL);
            System.out.println("Check " + (timeB * 60) + " minutes"+ " (" + timeB + " hours) + " + timeBL + " minutes = " + ((timeB*60)+timeBL) + " minutes");
        }
        if ((timeB*60+timeBL) == minutes)
        {
            System.out.println("Check Passed!");
        }
        else
        {
            System.out.println("Check Failed!");
        }
    }
}
