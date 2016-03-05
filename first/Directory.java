package lecture9.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Directory {
    private ArrayList<File> directoryList = new ArrayList<>();


    public Directory() {

    }
    public Directory (ArrayList<File> arrayList){
        this.directoryList = arrayList;
    }

    public void addToDirectoryList(File a){
        this.directoryList.add(a);
    }

    public ArrayList<File> getDirectoryList() {
        return directoryList;
    }

    public File getElement (int indexOfElement){
        return directoryList.get(indexOfElement);
    }

    public void sortBySize() {
        ArrayList<File> newDirectory = new ArrayList<>(this.directoryList.size());
        Map<Integer, File> map = new HashMap<>();
        int sortStatements[] = new int[this.directoryList.size()];
        int count = 0;
        for (File a : this.directoryList
                ) {
            map.put(a.getSize(), a);
            sortStatements[count] = a.getSize();
            count++;
        }
        for (int i = 0; i < sortStatements.length; i++) {
            int index = i;
            boolean needChange = false;
            for (int j = i + 1; j < sortStatements.length; j++)
                if (sortStatements[j] < sortStatements[index]) {
                    index = j;
                    needChange = true;
                }
            if (needChange) {
                int smallerNumber = sortStatements[index];
                sortStatements[index] = sortStatements[i];
                sortStatements[i] = smallerNumber;
            }
        }
        for (int a : sortStatements
                ) {
            newDirectory.add(map.get(a));
        }
        this.directoryList = newDirectory;

    }

    @Override
    public String toString() {
        return directoryList.toString()+"\t";
    }
}

