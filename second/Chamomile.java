package lecture9.second;


public class Chamomile extends Flower {

    public Chamomile(String name, int size, String color) {
        super(name, size, color);
    }

    @Override
    protected void smell() {
        System.out.println("Smells like chamomile");
    }
}
