// Maverick Guinto
// 3/13/24
// Application Name: Order
import java.text.NumberFormat;
import java.util.Scanner;
public class Order 
{
    public static void main (String[] args)
    {
        NumberFormat number = NumberFormat.getCurrencyInstance();
        String name;
        int burger;
        int fry;
        int soda;
        double burgers = 1.69;
        double frys = 1.09;
        double sodas = 0.99;
        double tax = 1.085;
        double money;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter the number of burgers: ");
        burger = input.nextInt();
        System.out.print("Enter the number of fries: ");
        fry = input.nextInt();
        System.out.print("Enter the number of sodas: ");
        soda = input.nextInt();
        double total = burger * burgers + fry * frys + soda * sodas;
        double tTotal = total * tax;
        double taxed = tTotal - total;
        System.out.println("Total before tax: " + number.format(total));
        System.out.println("Tax: " + number.format(taxed));
        System.out.println("Final Total: " + number.format(tTotal));
        System.out.print("Enter the ammount tendered: ");
        money = input.nextInt();
        input.close();
        double change = money - tTotal;
        System.out.print("Change: " + number.format(change));

    }
}
