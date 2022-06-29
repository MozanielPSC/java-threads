import java.lang.reflect.Constructor;

public class Count extends Thread {

    public Count (){
    }
    @Override
    public void run() {
        for(int i =0;i<=100;i++){
            System.out.println(i);
        }
    }
    
}
