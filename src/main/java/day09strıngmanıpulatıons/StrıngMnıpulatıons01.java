package day09strıngmanıpulatıons;

import java.util.Scanner;

public class StrıngMnıpulatıons01 {
    public static void main(String[] args) {

        String str="Java is easy";

        //indexOf() method'u verilen charakter'lrin "ilk gorunumunun" index'ini verir
        int idxA=str.indexOf("a");
        System.out.println(idxA);//1

        //lastIndexOf() method'u verilen charakter veya charakter'lerin "son gorunum" index'ini verir
        int idx2=str.lastIndexOf("a");
        System.out.println(idx2);//9

        String s="Mississippi";
        int idxI=s.indexOf('i');//indexOf() hem String hem de char ile kullanilabilir.
        System.out.println(idxI);//1

        int idxIss1=s.indexOf("iss");//Ilk gorunumun ilk karakterinin index'ini verir
        System.out.println(idxIss1);//1

        int idxIss2=s.lastIndexOf("iss");//Son gorunumun ilk karakterinin index'xini verir
        System.out.println(idxIss2);//4


        //Example 1: Bir String'deki bir character'in tekrarli veya tekrarsiz olup olmadigini gosteren bir kod yaziniz
        //         "Helloooo" ==> H->tekrarsiz  e->tekrarsiz    l->tekrarli          o->tekrarli

        String t ="Helloooo";

        char c='l';
        if (t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsiz");
        }else {
            System.out.println("Tekrarli");
        }

        String u="Learn Java earn money";

        //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar character'i gectikten sonra istenen character'in
        //ilk gorunumunun index'ini return eder;
        int sonuc=u.indexOf("a",6);//Bu index 6 karakterden sonrasini alir
        System.out.println(sonuc);//7

        //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabule edip en bastan
        // bu indexe kadar olan karakterleri bir kutu icine aliniz ve lastIndexOf() method'unu sadece bu kutu icindeki String icin kullaniniz.

        String m="Hello everyone!";
        int e=m.lastIndexOf("e",5);
        System.out.println(e);

        String v =" ";

        //IsEmpty()method'u bir String'in bos olup olmadigini kontrol eder.
        //Eger String'de hic charcacter yoksa isEmpty() "true" return eder,her hangi bir character varsa "false' return eder.
        //length()==0 demek isEmpty() true verir demektir
        //Bir String'in bos olup olmadigini anlamak icin "length()==00" kullanmayin, "isEmpty()" kullanin
        boolean bosMu=v.isEmpty();
        System.out.println(bosMu);

        String x=" ";

        //isBlank() hem bos String icin hem de "sadece space" iceren String'ler icin return eder.
       boolean blankMi=x.isBlank();
        System.out.println(blankMi);

        //Example 2: Kullanicidan alinan isim mutlaka space den farkli en az bir character icermelidir.
        Scanner input=new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilk=input.nextLine();

        if (ilk.isBlank()){
            System.out.println("Sana ismini gir dedim");
        }else {
            System.out.println(ilk);
        }
    }
}
