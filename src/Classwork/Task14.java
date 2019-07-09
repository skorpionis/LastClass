package Classwork;
/*Поиск максимального элемента в массиве.
Размерность массива задается пользователем.
Пользователем вводится массив строк.
В полученном массиве необходимо найти самое длинное и самое короткое слово, вывести оба в консоль.*/

import java.util.Scanner;

public class Task14 {
        public static void main(String[]args){

            System.out.print("Задайте размер массива: ");
            int n = new Scanner(System.in).nextInt();
            String[] mas = new String[n];
            System.out.println("Размер массива = " + mas.length);

            //String mas []=new String[3];
            Scanner sc = new Scanner(System.in);
            for (int i=0; i<mas.length; i++){
                System.out.println("Введите строку ");
                mas[i]=sc.nextLine();
            }
            int max=mas[0].length();
            int min=mas[0].length();
            int maxi=0;
            int mini=0;

            for (int i=0; i<mas.length; i++){
                if (mas[i].length()>max){
                    max=mas[i].length();
                    maxi=i;
                }
                if (mas[i].length()<min){
                    min=mas[i].length();
                    mini=i;
                }
            }
            System.out.println("Самое длинное " + mas[maxi]);
            System.out.println("Самое короткое " + mas[mini]);
        }
    }

