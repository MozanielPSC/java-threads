public class Adjust extends Thread {
    private final Account account;
    private final double rate;
    public Adjust(final Account account,final double rate){
        this.account = account;
        this.rate = rate;
    }
    public synchronized void adjustBalance(){
       double total =  this.account.getBalance() * (double) (1 + this.rate);
       this.account.setBalance(total);
       System.out.println("Adjust " + this.account.getBalance());
    }
    @Override
    public synchronized void run(){
        adjustBalance();
    }

}
