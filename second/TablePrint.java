package lecture9.second;


public class TablePrint {
    static void bouquetPrint(Bouquet bouquet) {
        System.out.println("Размер букета " + bouquet.getArrayList().size() + " цветков.");
        for (Flower a : bouquet.getArrayList()
                ) {
            System.out.println("\tName: " + a.getName() + ". \tSize: " + a.getSize() + ". \tColor " + a.getColor() + ".");
        }

    }

    static void roseBushPrint(RoseBush roseBush) {
        System.out.println("Размер куста " + roseBush.getSize() + ". Number of roses: "+ roseBush.getRoseArrayList().size());
        for (Flower a : roseBush.getRoseArrayList()
                ) {
            System.out.println("\tName: " + a.getName() + ". \tSize: " + a.getSize() + ". \tColor " + a.getColor() + ".");
        }
    }
}