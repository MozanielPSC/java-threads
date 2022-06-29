public class Update extends Thread{
    private final Account account;
    private final double amount;
    public Update(final Account account,final double amount){
        this.account = account;
        this.amount = amount;
    }
    public synchronized void updateBalance(){
        double total = this.account.getBalance() + this.amount;
        this.account.setBalance(total);
        System.out.println("Update "+this.account.getBalance());
    }
    @Override
    public synchronized void run(){
        updateBalance();
    }
}
