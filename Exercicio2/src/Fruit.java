public class Fruit extends Thread {
    private String name;
    public Fruit(String name){
        this.name = name;
    }
    @Override
    public void run(){
        try{
            System.out.println(this.name);
            Thread.sleep(3000);
        }catch(InterruptedException e){
        }
    }
}
