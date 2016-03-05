package lecture9.first;


public class AudioFile extends File {
    public AudioFile(String name, String format, int size, boolean empty) {
        super(name, format, size, empty);
    }

    @Override
    protected void openFile() {
        super.openFile();
        System.out.println("My type is "+this.getFormat()+" and my size "+this.getSize()+"Kb");
    }

}
