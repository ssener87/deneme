package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        /*
        Kullaniciya ay ismi sorunuz ve kullanicinin verdigi ay isminden son aya kadar ekrana yazdirin
         */

        //Note: toLowerCase() methodu bir String'deki tum caracterleri kucuk harfe cevirir
        //      toUpperCase() methodu bir String'deki tum carakterleri buyuk harfe cevirir

        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismini giriniz...");
        String AyIsmi = input.next().toLowerCase();

        switch (AyIsmi) {
            case "ocak":
                System.out.println("Ocak");
                case "subat":
                System.out.println("Subat");
                case "mart":
                System.out.println("Mart");
                case "nisan":
                System.out.println("Nisan");
                case "mayis":
                System.out.println("Mayis");
                case "haziran":
                System.out.println("Haziran");
                case "temmuz":
                System.out.println("Temmuz");
                System.out.println("Agustos");
                case "eylul":
                System.out.println("Eylul");
                case "ekim":
                System.out.println("Ekim");
                case "kasim":
                System.out.println("Kasim");
                case "aralik":
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Gecerli ay ismi giriniz...");

        }

    }
}
