public class Adjust extends Thread {
    private final Account account;
    private final double rate;
    public Adjust(final Account account,final double rate){
        this.account = account;
        this.rate = rate;
    }
    
    @Override
    public void run(){
        this.account.adjustBalance(rate);
    }

}
