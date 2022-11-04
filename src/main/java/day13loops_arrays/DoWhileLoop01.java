package day13loops_arrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //Example 1: Kullanicidan bir sayi aliniz , sayi 100 den kucuk ise ekrana "Kazandin!" yazdiriniz
        //           Aksi halde ekrana "Kaybettin!" yazdiriniz
        //           Kullanici kazandikca oyun devam etmeli

        Scanner input = new Scanner(System.in);
        int sayi = 0;

//        do {
//            System.out.println("Bir sayi giriniz");
//            sayi=input.nextInt();
//
//            if (sayi<100){
//                System.out.println("Kazandiniz!");

//            }
//        }while (sayi<100);
//        System.out.println("Kaybettiniz!");

        //Example 2: Kullanicidan ismini aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz

        do {
            System.out.println("Lutfen isminizi giriniz");
            char ilkHarf = input.next().charAt(0);

            if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
                System.out.println("Ismi basariyla girdiniz");
            } else {
                System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal edilmistir");
                break;
            }
        } while (true);//while in icine bir sart koymamiz gerek.

        //Infinite Loop: Sonsuz dongu
        //Artirma azaltma kisminda hata yaparsaniz "infinite loop sorunsal"i olusur.
//        for (int i=1;i<4;i--){
//            System.out.println("Hi"); Bu kodu sakin calistirma sonsuz donguye girer
//
//        }

        //Artirma azaltma kismini yazmazsaniz "infinite loop sorunsal"i olusur.
//       for (int i=1;i<4;){
//           System.out.println("Hi!");
//       }

        //Artirma azaltma kismini yazmazsaniz "infinite loop sorunsal"i olusur.
//        int i=12;
//        while (i<15){
//            System.out.println("Hi!");
//        }



    }
}
