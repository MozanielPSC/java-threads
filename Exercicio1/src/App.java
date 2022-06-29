
public class App {
    public static void main(String[] args) throws Exception {
       Count count = new Count();
       count.start();
       try{
        count.join();
       }catch(InterruptedException e){
        
       }
       System.out.println("Programa finalizado");
    }
}

