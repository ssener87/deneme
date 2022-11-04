package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        /*
        Kullanicidan gun sayisini aliniz ve gun ismini ekrana yazdiriniz
        1 ==> Pazar     2==>Pazartesi
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz...");
        byte gunNo = input.nextByte();

        //1. Yol: If ile cozum
        if (gunNo == 1) {
            System.out.println("Pazartesi");
        } else if (gunNo == 2) {
            System.out.println("Sali");
        }else if (gunNo == 3) {
            System.out.println("Carsamba");
        } else if (gunNo==4) {
            System.out.println("Persembe");
        } else if (gunNo==5) {
            System.out.println("Cuma");
        } else if (gunNo==6) {
            System.out.println("Cumartesi");
        } else if (gunNo==7) {
            System.out.println("Pazar");

        }else {
            System.out.println("Gecerli gun no giriniz");
        }

        //2.Yol: switch ile cozum
        switch (gunNo) {      //switch If else de sart sayisi cok olugunda kullanilir
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecerli gun sayisi giriniz");
        }

    }
}
