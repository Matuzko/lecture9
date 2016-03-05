package lecture9.second;


import java.util.ArrayList;

public class RoseBush {
    private int size;

    private ArrayList<Rose> roseArrayList = new ArrayList<>();

    public RoseBush(int size, ArrayList<Rose> roseArrayList) {
        for (Rose a : roseArrayList
                ) {
            if (a.getSize() >= size) {
                a.setSize(size);
            }
            this.roseArrayList.add(a);
        }
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Rose> getRoseArrayList() {
        return roseArrayList;
    }

}
