import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * Write a description of class Lab6Pt2BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab6Pt2BankAccount
{
    public static void main(String[] args){
        int mode, time;
        double temp;
        
        BankAccountSystem bank = new BankAccountSystem();
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.print("Press 1 to use console or 2 to use GUI: ");
            mode = keyboard.nextInt();
            System.out.println();
        }while(mode != 1 || mode != 2);
        System.out.print("What is your starting balance: $");
        temp = keyboard.nextDouble();
        bank.getBalance(temp);
        System.out.print("What is your interest rate? (ie wnter 3.5 for 3.5%): $");
        temp = keyboard.nextDouble();
        bank.getInterest(temp);
        System.out.print("How many month do you want to calculate? ");
        time = keyboard.nextInt();
        System.out.println("===============================");
        if(mode == 1){
            for(int i = 1; i <= time; i ++){
                int temDeposit, temWithdraw;
            }
        }
        
    }
}
