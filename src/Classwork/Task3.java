package Classwork;
/* Написать метод
 Положительное или отрицательное число
 Ввести число с клавиатуры
 Если число положительное, то увеличить его в два раза
 Если число отрицательное, то прибавить к нему единицу
 Есди введенное число равно 0, то вывести на экран 0.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if(a>0)
        {a*=2;
            System.out.println(a);
        }
       else if (a<0){
            a+=1;
            System.out.println(a);
        }
        else if (a==0){
            a=0;
            System.out.println(a);}
    }
}
