package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Example 1: Sayilari alicidan alan ve toplama islemi yapan kodu yaziniz

        //1. Adim: Scanner Class'indan object olusturur
        Scanner input=new Scanner(System.in);

        //2.Adim: Kulaniciya ne yapacagini soyle
        System.out.println("İlk sayiyi giriniz...");
        double sayi1=input.nextDouble();

        System.out.println("İkinci sayiyi giriniz...");
        double sayi2=input.nextDouble();

        System.out.println(sayi1 + sayi2);


    }
}
