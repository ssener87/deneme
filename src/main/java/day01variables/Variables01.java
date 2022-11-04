package day01variables;

public class Variables01 {

    /* variable nasil olusturulur?

   1) access modifier yazilacak
   2) Data Type
   3) Variable Ismi
   4) =
   5) Deger

*/
    //Java da ";"Ingilizce deki "." gibidir.
    //Ingilizce de "cumle" deriz,Java da "statement" deriz

     //"=" ismi ( Assingnment Operator ) eşittir demeyiniz.
    // Assignment Operator Sağdaki Değeri Alır Soldaki varieble'in içerisine koyar.
    // "=" Türkçe anlamı atama operatorü.

    public int age =13;
    public int height =183;


          //Java da Data Type'lari
    /*
                                 Primitive Data Types
      1)int: Integer'in kisaltimasi. Integer tam sayi demektir. 32 bit kullanir.
             Matematik'te tam sayilarin basi ve sonu yoktur fakat Java da tamsayilarin basi ve sonu vardir.
             En kucuk int:-2,147,483,648
             En buyuk int: 2,147,483,647

      2)byte: Tam sayilar icin kullanilir. 8 bit kullanir.
              En kucuk byte = -128 (dahil)
              En buyuk byte = 127  (dahil)

      3)short: Tamsayilar icin kullanilir. 16 bit kullanir.
               En kucuk short =-32768
               En buyuk short =32767

      4)long: Tam sayilar icindir. 64 bit kullanir
              En kücük long =-9,223,372,036,854,755,808
              En buyuk long =9,223,372,036,854,755,807

      5)float: Ondalikli sayilar icindir.
              "float" virgulden sonra 7 basamak icerir.
              "float" degerlerinde sona "f" veya "F" koymaniz gerekir.

      6)double: Ondalikli sayilar icindir.
                "double" virgulden sonra 16 basamak icerir.

      7)boolean: "true" veya "false" degerleri icin kullanilir. 1 bit kullanir.

      8)char: Tek karakter icin kullanilir. 16 bit kullanir.
              A,c,2,?,_,=
              Note: "char" lara deger verirken , degeri tek tirnak arasina koyunuz. Yoksa hata verir.

              Note: Java buyuk ve kucuk harflere duyarlidir.
                    Java icin TRUE ve True birbirinden farklidir.

       Note: Numeric Data Tyepes: byte < short < int < long < float < double
             Numeric OLmayan Data Types: boolean-char

                               Non-Primitive Data Types
         String: Isim ,adres ,kimkil numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
         String degerleri mutlaka cift tirnak icine konulmalidir.
         String non-primitive'dir. Yani bir String olusturdugumuzda Java size bir suru method verir.

         Primitive ile Non-Primitive lerin farki nedir?
         1)Non-Primitive data type'larinda degerin yanında methodlar vardir.
           Prmitive data type'larinda ise sadece deger vardir, method yoktur.
         2)Primitive data type'lari Java tarafindan olusturulmustur,toplam 8 tanedir,biz Primitive data olusturamayiz
           Non-Primitive data type'lari Java tarafindan olusturulmustur,bizde olusturabiliriz. Non-Prmitive sayilamiyacak
           kadar coktur,cunku her developer Non-Primitive data type olusturabilir
         3)Primitive data type isimleri kucuk harfle baslar
           Non-Primitive data type isimleri buyuk harfle baslar
         4))Primitive data type'lar memory'de farkli buyuklukte yerler kullanir.
            Non-Primitive'lerin hepsi memory'de ayni buyuklukte yer kullanirlar.



     */

    public byte price =12;
    public short populationOfVillage =23000;

    public float priceOfShirt =13.99F;
    public double weightOfCell = 0.000012045;

    // Siz "long" demenize ragmen Java bunu "int" kabul eder.
    //Bu yuzden ,Long bir variable'a "int" araliginin disinda bir sayi verirseniz mutlaka "L" koyunuz.
    public long populationOfWorld = 7000000000L;

    //Burada "L" koymadigimiz halde problem yok cunku "1234"int araliğina uyar.
    public long x =1234;

    public boolean isOld = true;
    public boolean isRich =false;

    public char inital= 'S';

    public String name = "Tom Hanks";
    //Note: "main method" arabanin motoru gibidir.
    // "main method" calismadan hicbirsey calismaz.

    public static void main(String[] args) {


    }
}


