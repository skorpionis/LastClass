package Classwork;

import java.util.Arrays;
import java.util.Random;

/*Массив размерностью 20 чисел заполняется случайными целыми числами
от -10 до 10 (Использовать рандомизатор).
Найти Максимальный положительный и отрицательный элемент массива, поменять их местами.*/
public class Task12 {


    public static void main (String[] args) {
        Random rand = new Random();
        int size = 20;
        int[] array = new int[size];
        int min = 0;
        int max = 0;
        int temp;

        for ( int i = 0; i < size; i++ ) {
            array[i] = rand.nextInt(21)-10;
            if ( array[min] > array[i] ) min = i;
            if ( array[max] < array[i] ) max = i;
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Min: " + "array("+min+")=" + array[min]);
        System.out.println("Max: " + "array("+max+")=" + array[max]);

        temp = array[min];
        array[min] = array[max];
        array[max] = temp;
        System.out.println(Arrays.toString(array));
    }
}
