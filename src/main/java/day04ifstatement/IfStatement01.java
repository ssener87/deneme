package day04ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {


        //If it rains I will cancel the picnic
        //if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar

        //Example 1: Sayi pozitif ise ekrana pozitif yazdirin.

        int s=12;

        if (s>0) {
            System.out.println("Positive");

        }

        //Example2: Verilen karakter buyuk harf ise ekrana buyuk harf yazdirin

        char ch='A';
        if (ch>='A'&& ch<='Z') {
            System.out.println("Buyuk Harf");

        }

        /*
          Note:   && = and   islemi sadece boolean ile kullanılır.
            true && true = true
            true && false = false
            false && true = false
            false && false = false

            && islemi mukemmemmelliyetcidir, true sunucunu alabilmek icin hersey true olamlidir.
            Bir tane false varsa sonuc false demektir
       */

        //Example 3: Verilen bir sayi uc basamakli ise ekrana "Uc basamakli yazdiriniz"

        int sayi=-123;

       sayi= Math.abs(sayi);  // Math.abs(sayi) negatif sayiyi pozitife cevirir/(mutlak deger)

        if (sayi>99 && sayi<1000){ // n>=100 && n<=999 veya n>99 && n<1000
            System.out.println("Uc basamakli");
        }

        //Examaple 4: Verilen bir sayi cift sayi ise ekrana cift sayi yazdiriniz

        int sayi1=-14;
        sayi1=Math.abs(sayi1);

        //"=" atama operatorudur,matematikteki esittir anlamina gelmez.
        //Matematikteki esittir sembolu Java'da "==" seklindedir.
        //Or:2+3 == 5
        if (sayi1%2==0){
            System.out.println("Cift sayi");


        }

        //Example 5: Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise "Harika Sayi" yazdiriniz

        int r=250;

        if (r<300 || r>1200){
            System.out.println("Harika sayi");
        }


        /*
       || islemi sadece boolean ile kullanilir.
              true || true = true
              true || false= true
              false || true= true
              false || false= false
      Not: || isleminde false alabilmek icin herseyin false olmasi gerekir.
           || isleminde sadece bir tane true sonucu true yapmaya yeter
      */





    }
}
