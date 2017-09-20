import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void Main(String args[]) throws FileNotFoundException, IOException{
        BufferedReader in = new BufferedReader(new FileReader("Tekst eksempel.txt"));
        String line = in.readLine();
        while(line != null){
            System.out.println(line);

            line = in.readLine();
        }
        if(in != null){
            in.close();
        }
    }
}
