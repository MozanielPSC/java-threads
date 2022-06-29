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
    public void run(){
        printBalance();
    }
    public synchronized void printBalance(){
        System.out.println("Get "+ this.balance);
    }

    public synchronized void adjustBalance(double rate){
        double total =  this.getBalance() * (double) (1 + rate);
        this.setBalance(total);
        System.out.println("Adjust " + this.getBalance());
     }
     public synchronized void updateBalance(double amount){
        double total = this.getBalance() + amount;
        this.setBalance(total);
        System.out.println("Update "+this.getBalance());
    }
    
}
