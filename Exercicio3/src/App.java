public class App {
    public static synchronized  void main(String[] args) throws Exception {
       Account mozani = new Account(100);
       Update update = new Update(mozani,1000);
       Adjust adjust = new Adjust(mozani,0.01);
       mozani.start();
       update.start();
       adjust.start();
       try{
        mozani.join();
        update.join();
        adjust.join();
       }catch(InterruptedException e){
        
       }
       System.out.println(mozani.getBalance());
    }
}