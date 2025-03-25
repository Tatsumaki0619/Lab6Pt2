
/**
 * This program helps the user calculate and generate blueprint of the user's bank account information, including
 * interest rate, current balance, current interest, total deposit, total withdraw and total interest.
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 3/20/2025
 */

public class BankAccountSystem
{
    private double balance, deposit, withdraw, interest, monthlyIntrate;

    /**
     * This is a basic constructor and will set the monthly interest rate to 0.035/12, and set the rest of the information to 0.
     * (The user should input the yearly interest rate and the program will convert it to monthly rate.
     * The user's input should look like i.e.: 3.5(same as 3.5%))
     */
    public void BankAccount() //no-arg constructor
    { 
        monthlyIntrate = 0.035/12;
    }

    /**
     * This is a complete constructor and will set the balance, monthly interest rate based on the user's inputs
     * (The user should input the yearly interest rate and the program will convert it to monthly rate.
     * The user's input should look like i.e.: 3.5(same as 3.5%))
     * @param inBalance This is the starting balance the user entered
     * @param inRate This is the year interest rate the user entered
     */
    public void BankAccount(double inBalance, double inRate){
        balance = inBalance;
        monthlyIntrate = inRate/1200;
        interest = 0;
    }

    /**
     * This method will store the user's monthly deposit, and accumulate it to the total deposit and change the user's balance.
     * @param add This is user's monthly deposit based on the user's input.
     */
    public void makeDeposit(double add){
        balance += add;
        deposit += add;
    }

    /**
     * This method will store the user's monthly withdraw, and accumulate it to the total withdraw and change the user's balance.
     * @param sub This is user's monthly withdraw based on the user's input.
     */
    public void makeWithdraw(double sub){
        balance -= sub;
        withdraw += sub;
    }

    /**
     * This method will calculate the user's monthly interest, and accumulate to the total interest.
     * If the current balance is 0, this month's interest will be 0. 
     */
    public void calcInterest(){
        if (balance > 0){
            interest += monthlyIntrate * balance;
            balance += monthlyIntrate * balance;
        }
        else{
            interest += 0;
        }
    }

    /**
     * This method will return the user's current balance.
     * @return This is the user's current balance.
     */
    public double getBalance(){
        return balance;
    }

    /**
     * This method will return the user's current total deposit.
     * @return This is the user's current total deposit.
     */
    public double getDeposit(){
        return deposit;
    }

    /**
     * This method will return the user's current total withdraw.
     * @return This is the user's current total withdraw.
     */
    public double getWithdraw(){
        return withdraw;
    }

    /**
     * This method will return the user's current total interest.
     * @return This will be the user's current total interest.
     */
    public double getInterests(){
        return interest;
    }

    /**
     * This is a complete constructor and will set the balance, monthly interest rate based on the user's inputs
     * (The user should input the yearly interest rate and the program will convert it to monthly rate.
     * The user's input should look like i.e.: 3.5(same as 3.5%))
     * @param inBalance This is the starting balance the user entered
     * @param inRate This is the year interest rate the user entered
     */
    public void BankAccount(String inBalance, String inRate){
        balance = Double.parseDouble(inBalance);
        monthlyIntrate = Double.parseDouble(inRate)/1200;        
    }

    /**
     * This method will store the user's monthly deposit, and accumulate it to the total deposit and change the user's balance.
     * @param add This is user's monthly deposit based on the user's input.
     */    
    public void makeDeposit(String add){
        double temp = Double.parseDouble(add);
        balance += temp;
        deposit += temp;
    }

    /**
     * This method will store the user's monthly withdraw, and accumulate it to the total withdraw and change the user's balance.
     * @param sub This is user's monthly withdraw based on the user's input.
     */
    public void makeWithdraw(String sub){
        double temp = Double.parseDouble(sub);
        balance -= temp;
        withdraw += temp;
    }
}
