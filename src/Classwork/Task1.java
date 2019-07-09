package Classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void main(String[] args) {
        Task1.ch();
    }
    public static void ch()  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s1 = null;
        try {
            s1 = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        double a = Float.parseFloat(s);
        double b = Float.parseFloat(s1);

        if(Math.abs(a-10)<(Math.abs(b-10))){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
