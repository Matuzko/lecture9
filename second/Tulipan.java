package lecture9.second;


public class Tulipan extends Flower {
    @Override
    protected void smell() {
        System.out.println("Smells like tulpan!");
    }

    public Tulipan(String name, int size, String color) {
        super(name, size, color);
    }
}
