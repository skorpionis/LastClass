package Classwork;

/**
 * Created by Ariec on 09.07.2019.
 */
import java.io.*;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader filename = new FileReader("text.txt");
        //String filename = "text.txt";
        String name = br.readLine();
        int c;
        while ((c = filename.read()) != -1) System.out.println((char) c);
    }
}