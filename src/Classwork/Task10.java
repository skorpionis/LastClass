package Classwork;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Ariec on 09.07.2019.
 */
public class Task10 {

    public static void FileOut(File file) throws IOException {
        ArrayList<String > arr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (reader.ready()){
            String s = reader.readLine();
            arr.add(s);
            System.out.println(arr.get(arr.size()-1));
        }
        reader.close();
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = new FileWriter(file);
        for (int i = 0; i <arr.size() ; i++) {
            System.out.println("Vvedite stroku ");
            String s2 = reader1.readLine();
            writer.write(s2);
        }
        reader1.close();
        writer.close();
    }

    public static void main(String[] args) {
            FileOut(new File("C://"));
    }
}
