package lecture9.second;


public class Rose extends Flower {

    public Rose(String name, int size, String color) {
        super(name, size, color);
    }

    @Override
    protected void smell() {
        System.out.println("Smells like rose!");
    }


}

