package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Arrays01 {

    //Arrays'lerin icine sadece "primitive data type"leri ve "reference"lar (adres demek) konabilir.
    public static void main(String[] args) {

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";

        System.out.println(Arrays.toString(str));//[Java, did, surprise you]

        //Examaple 1: String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz

        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : arr) {

            System.out.print(w + " ");

            if (w.equals("Tom")) {
                break;
            }
        }
        System.out.println();

        // Example 2: String bir Array olusturunuz ve "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz

        String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : brr) {

            if (w.equals("Jane") || w.equals("Tom")) {
                continue;//bosver demek
            }
            System.out.print(w + " ");//Mark Christopher Ali Rojda
        }
        System.out.println();

        //Example 3: Bir ogretmenin sinifindaki ogrencilerin islemlerini application'a yuklemesini saglayan kodu yaziniz.
        //           Kullanici ile beraber bir Array olusturunuz.

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz?");//Array'lerde eleman sayisini sormamiz gerek
        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz.");

        for (int i = 1; i <= numOfStd; i++) {

            System.out.println("Lufen " + i + ". ogrencinin ilk ismini giriniz");

            String stdName = input.next();

            if (stdName.equalsIgnoreCase("Q")) {
                break;
            }
            names[i - 1] = stdName;
        }
        System.out.println(Arrays.toString(names));
    }
}
