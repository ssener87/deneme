package day20stringbuildirstringbuffer;

public class StringBuilder01 {
    /*
    1) "StringBuilder" Java'da bir Class'dir.
    2) "StringBuilder",String olusturmaya yarar.
    3) "String" Class varken nicin "StringBuilder" a ihtiyac duyariz?
       Cunku "String" Class "Immutable Class"dir, ama biz bazen "Mutable String"lere ihtiyac duyariz,
       StringBuilder bize "Mutable" String verir
    4) "Immutable Class"larda varolan deger degistirilemez.Siz varolan bir degeri degistirmek istediginizde
       i)Memory'de yeni bir variable yeni degerle olusturulur
       ii)Eski variable'in  pointer'ı yeni variable'a döndürülür.
       iii)Eğer bir variable'ı hiç bir pointer göstermiyor ise o variable "Garbage Collector" tarafından silinir.

         "Mutable Class"larda var olan değer değiştirilebilir. Orijinal değer korunmaz.
    5) "String Class" larin "immutable" yapisi "security" icin onemlidir.
    Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni deger sahip String'lerin bu container'i
    kullanmasini temin eder. Bu memeory'i korumak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde tum variable'larin
    etkilenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin Java, String'leri "immutable(degismez)" yapmistir. Fakat herhangi bir variablee'in
    degerini degistirmek icin Java bir yol bulmustur. Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu
    yeni variable'a yonlendirir. Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.

     */

    public static void main(String[] args) {

        String str="Java";
        str="Super Java";
        System.out.println(str);

        //StringBuilder nasil olusturulur?
        //1.Yol:
        StringBuilder strb1=new StringBuilder("Java");
        System.out.println(strb1);//Java

        //2.Yol:
        StringBuilder strb2=new StringBuilder();
        //Yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);//Java is easy!!!

        //Yol b:
        strb2.append(" Learn").append(" Java earn").append(" money");
        System.out.println(strb2);//Java is easy!!! Learn Java earn money

        //StringBuilder'larda character sayisi nasil bulunur? ==>length() method'u ile bulunur.
        StringBuilder strb3=new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx");

        int numOfChar=strb3.length();
        System.out.println(numOfChar);//3

        //Capavity asimlarinda capacity varolanin iki katinin iki katina cikar.
        int capacity1=strb3.capacity();
        System.out.println(capacity1);//34

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmm");
        int capacity2=strb3.capacity();
        System.out.println(capacity2);//70

        //setCharAt(2,'r');==>Index 2'deki character'i "r" ye cevirir.
        strb3.setCharAt(2,'r');
        System.out.println(strb3);//Carxxxxxxxxxxxxxxxmmmmmmmmmmmmmmmmmmmmmmm

        //delete(3,18);==>Index 3(dahil) Index 18(haric) tum characterleri siler.
        strb3.delete(3,18);
        System.out.println(strb3);//Carmmmmmmmmmmmmmmmmmmmmmmm

        //.deleteCharAt(2);==>Index 2 deki character'i siler
        strb3.deleteCharAt(2);
        System.out.println(strb3);//Cammmmmmmmmmmmmmmmmmmmmmm

        //reverse(); method'u StringBuilder'i ters cevirir. Ali==>ilA
        //"muteble"larda sadece method kullanmak orjinal degeri degistirmek icin yeterlidir
        strb3.reverse();
        System.out.println(strb3);//mmmmmmmmmmmmmmmmmmmmmmmaC

        //"Immutable"larda orijinal degeri degistirmek icin method'u kullanmak yeterli olmaz bir de "atama islemi" yapmalisiniz/
        String abc="Java";
        abc.replace("a","i");
        System.out.println(abc);//Java

        //toString();method'u StringBuilder'lari String'e cevirir
        String stsringstrb3=strb3.toString();
        System.out.println(stsringstrb3);//mmmmmmmmmmmmmmmmmmmmmmmaC

        //String'den de StringBuilder'a asagidaki gibi donersiniz.
        StringBuilder strb4=new StringBuilder(stsringstrb3);
        System.out.println(strb4);//mmmmmmmmmmmmmmmmmmmmmmmaC

        //insert(3,"XXXX");3.character'den sonra "XXXX"leri koyar
        strb4.insert(3,"XXXX");
        System.out.println(strb4);//mmmXXXXmmmmmmmmmmmmmmmmmmmmaC

        //insert(3,"KLMNOPQRST",5,8);==>3. character'den sonra ,"KLMNOPQRST" String'inin index 5,6,7 deki characterlerini yerlestirir.
        strb4.insert(3,"KLMNOPQRST",5,8);
        System.out.println(strb4);//mmmPQRXXXXmmmmmmmmmmmmmmmmmmmmaC

        StringBuilder a=new StringBuilder("Java");
        StringBuilder b=new StringBuilder("Java");

        //a.compareTo(b);method'u i)StringBuilder'lar tamaiyla ayni ise 0 verir
        //                        ii)a alfabetik sirada b'den sonra gelirse pozitif olarak aradaki siralama farkini gosterir.
        //                        ii)a alfabetik sirada b'den oncegelirse pozitif olarak aradaki siralama farkini gosterir.
        int sonuc=a.compareTo(b);
        System.out.println(sonuc);









    }
}
