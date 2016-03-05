package lecture9.first;

import lecture9.Caesar;

public class DirectoryTest {

    public static void main(String[] args) {
        Directory directory = new Directory();

        AudioFile audioFile1 = new AudioFile("audio1", "mp3", 234567, false);
        AudioFile audioFile3 = new AudioFile("audio3", "mp3", 23567, false);
        AudioFile audioFile2 = new AudioFile("audio2", "mp3", 23457, false);

        ImageFile imageFile1 = new ImageFile("image1", "jpeg", 12345, false);
        ImageFile imageFile2 = new ImageFile("image2", "jpeg", 12385, false);
        ImageFile imageFile3 = new ImageFile("image3", "jpeg", 32345, false);

        TextFile textFile1 = new TextFile("text1", "doc", 234432, false);
        TextFile textFile2 = new TextFile("text2", "doc", 234482, false);
        TextFile textFile3 = new TextFile("text3", "doc", 234632, false);

        directory.addToDirectoryList(audioFile1);
        directory.addToDirectoryList(audioFile2);
        directory.addToDirectoryList(audioFile3);
        directory.addToDirectoryList(imageFile1);
        directory.addToDirectoryList(imageFile2);
        directory.addToDirectoryList(imageFile3);
        directory.addToDirectoryList(textFile1);
        directory.addToDirectoryList(textFile2);
        directory.addToDirectoryList(textFile3);


        for (File a : directory.getDirectoryList()
                ) {
            a.setName(Caesar.fromNormalToCaesar(a.getName()));

        }
        System.out.println(directory);


    }
}









