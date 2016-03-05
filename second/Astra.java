package lecture9.second;

public class Astra extends Flower {
    public Astra(String name, int size, String color) {
        super(name, size, color);
    }

    @Override
    protected void smell() {
        System.out.println("Smells like astra");
    }
}
