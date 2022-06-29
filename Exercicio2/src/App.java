public class App {
    public static void main(String[] args) throws Exception {
        Fruit banana = new Fruit("Banana");
        Fruit avocado = new Fruit("Avocado");
        Fruit papaya = new Fruit("Papaya");
        Fruit orange = new Fruit("Orange");
        Fruit blueberry = new Fruit("Blueberry");
        banana.start();
        avocado.start();
        papaya.start();
        orange.start();
        blueberry.start();
    }
}
