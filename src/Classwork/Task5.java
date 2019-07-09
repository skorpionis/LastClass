package Classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {

    public static void sol() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s1);
        int c = Integer.parseInt(s2);
        boolean fl=true;
        if(a>=b+c)
            fl=false;
        else if(b>=a+c)
            fl=false;
        else if(c>=b+a)
            fl=false;
        if(fl) System.out.println("est");
        else System.out.println("net");
    }
    public static void main(String[] args) throws IOException {
        Task5.sol();
    }
}
