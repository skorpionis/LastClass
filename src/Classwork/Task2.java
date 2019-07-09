package Classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public static void ifSearch() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int a = Integer.parseInt(s);

        if(a<1||a>12){
            System.out.println("Neverniy month");
        }else{
            if(a==1||a==2||a==12)
                System.out.println("Zima");
            if(a==4||a==5||a==6)
                System.out.println("Vesna");
            if(a==7||a==8||a==9)
                System.out.println("Leto");
            if(a==10||a==11||a==12)
                System.out.println("Osenb");
        }
    }

    public static void  switchSearch(){
        int month = 12;
        String m;

        switch (month) {
            case 1:
                m = "z";

            case 2:
                m = "z";
                break;
            case 3:
                m = "v";
                break;
            case 4:
                m = "v";
                break;
            case 5:
                m = "v";
                break;
            case 6:
                m = "l";
                break;
            case 7:
                m = "l";
                break;
            case 8:
                m = "l";
                break;
            case 9:
                m = "os";
                break;
            case 10:
                m = "os";
                break;
            case 11:
                m = "os";
                break;
            case 12:
                m = "z";
                break;

            default:
                m = "Invalid ";
                break;

        }
        System.out.println("Vr goda: " + m);
    }

    public static void main(String[] args) throws IOException {

        Task2.ifSearch();
        //Month.switchSearch();
    }

}