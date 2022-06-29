public class Adjust extends Thread {
    private static Account account;
    private static double rate;
    public Adjust(Account account,double rate){
        this.account = account;
        this.rate = rate;
    }
    public synchronized void adjustBalance(){
       double total =  this.account.getBalance() * (double) (1 + this.rate);
       this.account.setBalance(total);
       System.out.println("Adjust " + this.account.getBalance());
    }
    @Override
    public void run(){
        adjustBalance();
    }

}
