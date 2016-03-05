package lecture9.first;


public class ImageFile extends File {
    public ImageFile(String name, String format, int size, boolean empty) {
        super(name, format, size, empty);
    }

    @Override
    protected void openFile() {
        super.openFile();
        System.out.println("My type is " + this.getFormat() + " and my size " + this.getSize() + "Kb");
    }

}
