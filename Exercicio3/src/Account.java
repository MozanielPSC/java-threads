public class Account extends Thread{
    private double balance;
    public Account(double balance){
        this.balance = balance;
    }
   public synchronized void setBalance(double balance){
        this.balance = balance;
    }
    public synchronized double  getBalance(){
        return this.balance;
    }
    @Override
    public synchronized void run(){
        printBalance();
    }
    public synchronized void printBalance(){
        System.out.println("Get "+this.balance);
    }
}
