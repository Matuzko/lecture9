package lecture9.second;

public abstract class Flower {
    private String name;
    private int size;
    private String color;


    protected void smell() {
    }

    public Flower(String name, int size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\tFlower{" +
                "\tname='" + name + '\'' +
                ", \tsize=" + size +
                ", \tcolor='" + color + '\'' +
                "}\n";
    }
}