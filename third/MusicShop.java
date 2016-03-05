package lecture9.third;


import java.util.ArrayList;

public class MusicShop {
    private ArrayList <MusicalInstrument> musicalInstruments = new ArrayList<>();
    private int numberOfInstruments;

    public MusicShop(ArrayList<MusicalInstrument> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
        numberOfInstruments = musicalInstruments.size();
    }
}
