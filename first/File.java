package lecture9.first;


public abstract class File {
    private String name;
    private int size;
    private String format;
    private boolean empty;

    protected void openFile(){

    }

    public File(String name, String format, int size, boolean empty) {
        this.name = name;
        this.format = format;
        this.size = size;
        this.empty = empty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    @Override
    public String toString() {
        return " \tName: " +name +
                " \tsize=" + size +
                ", \tformat='" + format + '\'' +
                ", \tempty=" + empty + "\n";

    }
}

