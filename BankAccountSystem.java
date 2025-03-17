
/**
 * Write a description of class BankAccountSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccountSystem
{
    private double balance, deposit, withdraw, interest, monthlyIntrate;
    
    public void BankAccount(){
        monthlyIntrate = 0.035/12;
    }
    
    public void BankAccount(double inBalance, double intRate){
        
    }
    
    public void BankAccount(String inBalance, String intRate){
        
    }
    
    public void makeDeposit(double add){
        
    }
    
    public void makeDeposit(String add){
        balance += add;
    }
    
    public void MakeWithdraw(String sub){
        
    }
    
    public void MakeWithdra(double sub){
        balance -= sub;
    }
    
    public void calcInterest(){
        interest = monthlyIntrate * balance; 
    }
    
    public double getBalance(){
        balance = balance - withdraw + interest + deposit;
        return balance;
    }
    
    public double getDeposit(){
        deposit +=   
        return
    }
    
    public double getWithdraw(double dep){
    }
    
    public double getInterest(){
        return
    }
    
}
