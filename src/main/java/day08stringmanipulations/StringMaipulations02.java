package day08stringmanipulations;

public class StringMaipulations02 {
    public static void main(String[] args) {

        //Example 1: Bir Stringdeki space haric kac tane character kullanildigini gosteren kodu yaziniz
        //           "Ali okula gitti." ==>14

        String str="Ali okula gitti.";

        //replace() method'u bir Stringdeki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir
        int num=str.replace(" ","").length();
        System.out.println(num);

        //Example 2: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz

        String s="Ankara'nin tasina gozlerimin yasina bak.";

        String yeniS=s.replace("a","A");
        System.out.println(yeniS); //Kara * dusunme An*

        //Example 3:Bir String'deki tum "kara kelimesinin yerine "*"kyunuz

        String t="Kara kara dusunme Ankara";

        String yaniT=t.replace("kara","*");
        System.out.println(yaniT);

        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //           "AC20217004"==> AC*******

        String stdId="AC20217004";
        String yeniSdtId=stdId.replaceAll("[0-9]","*");
        System.out.println(yeniSdtId);//AC********

        /*
        Bir grup data'yi ifade eden kod'lara "Regex" denir.
        "Regex" Regular Expression in kisaltilmis halidir.

        1)Tum rakamlar==>[0-9]
        2)Tum kucuk harfler==>[a-z]
        3)Tum buyuk harfler==>[A-Z]
        4)Tum harfler==>a-ZA-Z]
        5)Sesli harfler==>[aeiouAEIOU]
        6)Space ==>[ ]
        7)Tum rakamlar ve tum harfler==>[0-9a-zA-Z]
        8)Tum noktalama isaretleri==>\\p{Punct}

        1)Rakamlar haric tum karakterler==> [^0-9]
        2)Kucuk harfler haric tum karakterler==>[^a-z]
        3)Buyuk harfler haric tum karakterler==>[^A-Z]
        4)Tum harfler haric tum karakterler==>[^a-zA-Z]
        5)Space haric==>[^ ]
         */

        //Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karaktari haric
        //          tum karakterlerin sayisini bulan kodu yaziniz

        String u="Ali 13 yasinda, dersem inanma!...";

        int sonuc=u.
                replaceAll("[0-9]","").
                replace(" " ,"").
                replaceAll("\\p{Punct}" ,"").
                length();
        System.out.println(sonuc);

        //Example 6: Bir password'un gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //          i)Space haric en az sekiz karakter olmali
        //          ii)En az 1 sembol icermeli
        //          iii)En az 1 rakam icermeli
        //          iv)En az 1 buyuk harf iceermeli
        //          v)En az 1 kucuk harf icermeli



        String pwd= "B78c? K!m";

        //i)Space haric en az sekiz karakter olmali
       boolean first=pwd.replace(" ","").length()>7;

       // ii)En az 1 sembol icermeli
        boolean second=pwd.replaceAll("[0-9a-zA-z]","").length()>0;

        //iii)En az 1 rakam icermeli
        boolean third=pwd.replaceAll("[^0-9]" ,"").length()>0;

        // iv)En az 1 buyuk harf iceermeli
        boolean fourt=pwd.replaceAll("[^A-Z]","").length()>0;

        // v)En az 1 kucuk harf icermeli
        boolean fifth=pwd.replaceAll("[^a-z]" ,"").length()>0;

        boolean pwdGecerli=first && second && third && fourt && fifth;

        if (pwdGecerli){
            System.out.println("Password'unuz gecerli...");
        }else {
            System.out.println("Password'unuz geceli degil...");

        }

        //Example 7: Bir String'deki noktalama isaretlerinin sayisini gosteren kodu yaziniz
        String cumle="Sen yapmazsan, ben ?...";

        int number=cumle.replaceAll("[^\\p{Punct}]","").length();

        System.out.println(number);

        //Example 8: Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin
        //          aksi halde "Normal" yazdirin

        String v="Alex";
       boolean baslangic=v.startsWith("Al");

       boolean bitis=v.endsWith("x");

       String result=baslangic && bitis ? "Harika" : "Normal";

        System.out.println(result);

    }
}
