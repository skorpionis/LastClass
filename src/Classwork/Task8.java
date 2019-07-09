package Classwork;

import java.io.*;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) throws IOException {
        String filename = "text.txt";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        PrintWriter printWriter = new PrintWriter(filename);
        while(!s.equals("stop")){
            printWriter.println(s);
        }
        printWriter.close();
    }
}
