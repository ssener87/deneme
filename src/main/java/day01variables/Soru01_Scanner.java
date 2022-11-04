package day01variables;

import java.util.Scanner;

public class Soru01_Scanner {
    public static void main(String[] args) {
        //Soru 1:Kullanicidan 2 tam sayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Kullanicidan 2 tam sayi isteyiniz ");
        int s1=scanner.nextInt();
        int s2=scanner.nextInt();

        System.out.println("Iki tam sayinin toplam,fark ve carpimi :"+(s1+s2)+" "+(s1-s2)+" "+(s1*s2));

        //Soru 2:Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz ");
        double k1=scanner.nextDouble();

        double kareninCevresi=(k1*4);
        double kareninAlani=(k1*k1);
        System.out.println("Karenin cevresi ve alani :" +kareninCevresi+" "+kareninAlani);

    }
}
