package Classwork;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Integer[] array = new Integer[3];
        try(Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Vvedite " + (i + 1) + " chislo: ");
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array, (o1, o2) -> Integer.compare(o2, o1));
            System.out.println(Arrays.toString(array));
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}




