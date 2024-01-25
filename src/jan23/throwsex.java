package src.jan23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwsex {
    public static void main(String[] args) throws FileNotFoundException {
    readfile("c://a.txt");
    }
    static void readfile(String filename) throws FileNotFoundException {
    File f=new File(filename);
        FileReader filereader=new FileReader(filename);
        //while typing we will get redline in filereader.means checked exception.in case of checked we
        //need to add throws in both function definition and main function.incase 0f unchecked exception
        //only throw will be enough
        if(filename.length()==0){
            throw new FileNotFoundException();
        }
    }
}
