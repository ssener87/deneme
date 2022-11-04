package day18_arraylists_passbyvalue;

public class PassByValue01 {

    /*
      1)Java variable'larin orijinal degerlerini korumak ister.
      2)Variable method'lar icinde kullanildiginda ,Java method'un icine orijinal degeri koymaz,o degerin kopyasini verir.
        Ve method'a kopyayi yollar. Method kopya ustunde degisilklik yapar dolayisiyla variable'in orijinal degeri korunmus olur.
        Bu sisteme "Pass By Value" denir.
        Note: Java "Pass By Value" kulanir.
        Note: Bazi proglama dilleri orijinal degeri koruma altina almamistir. Bu isi developer'lara birakmistir.
        Bu tarz diller "Pass By Referance" kullanir.

     */
    public static void main(String[] args) {

        int x=5;
        System.out.println(x);//5

        //static method olan "main method" un icindeki hersey static olmalidir.
        change(x);
        System.out.println(x);//5

        int ucret=100;

       int kopya= indirim(ucret);

        System.out.println(kopya);//90
        System.out.println(ucret);//100

    }


    public static void change(int a){
        System.out.println(a*3);//3 katina alir
    }

    //void disindaki "return" type'larde method body'si icinde "return" keyword kullanilmalidir.
    public static int indirim(int gomlekUcreti){
        return gomlekUcreti-10;
    }
}
