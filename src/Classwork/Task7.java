package Classwork;

/**
 * Created by Ariec on 09.07.2019.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {

    public static void run() throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        double t = Double.parseDouble(br.readLine());

        int b = (int) t;
        int remain = b % 5;
        if (remain==3) {
            System.out.println("желтый");
            return;
        }
        if (remain==4) {
            System.out.println("красный");
            return;
        }
        System.out.println("зелёный");
    }

    public static void main(String[] args) throws IOException {
        Task7.run();
    }
}
