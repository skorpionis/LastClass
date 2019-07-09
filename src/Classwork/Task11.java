package Classwork;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int b = Integer.parseInt(s,2);

        System.out.println(Integer.toBinaryString(b));

        System.out.println(b);

    }
}
