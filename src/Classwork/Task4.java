package Classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Вывести на экран таблицу умножения для введенного с клавиатуры числа.
 Нельзя использовать циклы
 В коде не должно быть цифр
 Пример ввода "5"
 Пример вывода:
 "5 * 1 = 5"
 "5 * 2 = 5"
 и т.д.*/
public class Task4 {
static int per;

    public static void tab(int b, int a)  {
        a++;
        int r = a*b;
        System.out.print(b+"*"+a+"="+r+"\n");
        if(a<9){
            tab(b,a);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader.readLine());
        tab(b,per);
    }
}
