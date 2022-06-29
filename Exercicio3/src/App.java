public class App {
    /* A solução encontrada é utilizar o syncronyzed para sincronizar as threads */
    public static void main(String[] args) {
       Account mozani = new Account(100);
       Update update = new Update(mozani,1000);
       Adjust adjust = new Adjust(mozani,0.01);
       mozani.start();
       update.start();
       adjust.start();
    }
}
