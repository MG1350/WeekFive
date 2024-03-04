import java.text.NumberFormat;
import java.util.Scanner;
public class Election 
{
    public static void main (String[] args)
    {
        String name;
        String name1;
        int nVote;
        int nVote1;
        int nVote2;
        int Vote;
        int Vote1;
        int Vote2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an name: ");
        name = input.nextLine();
        System.out.print("Enter a second name: ");
        name1 = input.nextLine();
        System.out.print("Enter a result from New York for " + name + " :");
        nVote = input.nextInt();
        System.out.print("Enter a result from New Jersey for " + name + " :");
        nVote1 = input.nextInt();
        System.out.print("Enter a result from Connecticut for " + name + " :");
        nVote2 = input.nextInt();
        System.out.print("Enter a result from New York for " + name1 + " :");
        Vote = input.nextInt();
        System.out.print("Enter a result from New Jersey for " + name1 + " :");
        Vote1 = input.nextInt();
        System.out.print("Enter a result from Connecticut for " + name1 + " :");
        Vote2 = input.nextInt();
        input.close();
        int nTotal = (nVote+nVote1+nVote2);
        int Total = (Vote+Vote1+Vote2);
        int vTotal = nTotal + Total;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat number = NumberFormat.getIntegerInstance();
        NumberFormat decimal = NumberFormat.getNumberInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println("---------Election Data---------");
        System.out.println("\t\t" + name + " " + name1);
        System.out.println("New York \t" + nVote + " " + Vote);
        System.out.println("New Jersey \t" + nVote1 + " " + Vote1);
        System.out.println("Connecticut \t" + nVote2 + " " + Vote2);
        System.out.println("---------Election Results---------");
        System.out.println("Candidates \t Votes Percentage");
        System.out.println(name + "\t\t" + nTotal + " " + percent.format(vTotal-Total));
        System.out.println(name1 + "\t\t" + Total + " " + percent.format(vTotal-nTotal));
        System.out.println(percent.format(nVote2));

    }
}
