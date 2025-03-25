import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * This is a program that can help users calculate the user's bank account balance and interest.
 * The program can also record and accumulate the user's monthly deposit and withdraw.
 * The user can choose to sue a console or a GUI to get the output.
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 3/20/2025
 */
public class Lab6Pt2BankAccount
{
    public static void main(String[] args){
        int mode;
        BankAccountSystem bank = new BankAccountSystem();
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.print("Press 1 to use console or 2 to use GUI: ");
            mode = keyboard.nextInt();
        }while(!(mode == 1 || mode == 2));
        System.out.println();
        if(mode == 1){
            useConsole();
        }
        else{
            useGUI();
        }
        System.exit(0);
    }

    /**
     * This method can provide the user's bank account information in a console format,
     * including balance, total deposit, withdraw and total interest based
     * on the user's input value of starting balance and interest rate.
     */
    public static void useConsole(){
        double balance, intRate;
        int counter;
        BankAccountSystem bank = new BankAccountSystem();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your starting balance: $");
        balance = keyboard.nextDouble();
        System.out.print("What is your interest rate? (ie enter 3.5 for 3.5%): ");
        intRate = keyboard.nextDouble();
        System.out.print("How many month do you want to calculate? ");
        counter = keyboard.nextInt();
        System.out.println("===============================");
        bank.BankAccount(balance, intRate);
        for(int i=1;i<=counter;i++){
            System.out.print("Enter Month " + i + " deposits $");
            bank.makeDeposit(keyboard.nextDouble());
            System.out.print("Enter Month " + i + " withdraws $");
            bank.makeWithdraw(keyboard.nextDouble());
            bank.calcInterest();
        }
        System.out.println();
        System.out.printf("Ending balance: $%,.2f\n", bank.getBalance());
        System.out.printf("Total deposits: $%,.2f\n", bank.getDeposit());
        System.out.printf("Total withdraw: $%,.2f\n", bank.getWithdraw());
        System.out.printf("Total interest: $%,.2f\n", bank.getInterests());

    }

    /**
     * This method can provide the user's bank account information in a GUI format,
     * including balance, total deposit, withdraw and total interest based
     * on the user's input value of starting balance and interest rate.
     */
    public static void useGUI(){
        String balance, intRate, counter;
        int counter1;
        BankAccountSystem bank = new BankAccountSystem();

        balance = JOptionPane.showInputDialog("What is your starting balance: $");
        intRate = JOptionPane.showInputDialog("What is your interest rate? (ie enter 3.5 for 3.5%): ");
        counter = JOptionPane.showInputDialog("How many month do you want to calculate? ");
        counter1 = Integer.parseInt(counter);
        System.out.println("===============================");
        bank.BankAccount(balance, intRate);
        for(int i=1;i<=counter1;i++){        
            bank.makeDeposit(JOptionPane.showInputDialog("Enter Month " + i + " deposits $"));
            bank.makeWithdraw(JOptionPane.showInputDialog("Enter Month " + i + " withdraws $"));
            bank.calcInterest();
        }
        String print;
        print = String.format("Ending balance: $%,.2f\n" + 
            "Total deposits: $%,.2f\n" + "Total withdraw: $%,.2f\n" + 
            "Total interest: $%,.2f\n", bank.getBalance(), bank.getDeposit(), bank.getWithdraw(), bank.getInterests());
        JOptionPane.showMessageDialog(null,print);
    }
}
