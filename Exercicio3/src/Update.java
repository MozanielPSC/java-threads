public class Update extends Thread{
    private final Account account;
    private final double amount;
    public Update(final Account account,final double amount){
        this.account = account;
        this.amount = amount;
    }
    
    @Override
    public void run(){
        this.account.updateBalance(this.amount);
    }
}
