public class Update extends Thread{
    private static Account account;
    private static double amount;
    public Update(Account account,double amount){
        this.account = account;
        this.amount = amount;
    }
    public synchronized void updateBalance(){
        double total = this.account.getBalance() + this.amount;
        this.account.setBalance(total);
        System.out.println("Update "+this.account.getBalance());
    }
    @Override
    public void run(){
        updateBalance();
    }
}
