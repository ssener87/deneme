package day22inheritancepolymorphism;

public class HondaAccord extends Honda{
    /*
       1)Siz Class olusturdugunuzda Java otomatik olarak size gorunmez bir constructar verir,cunku
         Java,Class'in bir kalip oldugunu ve Object olusturmak icin yaratildigini ve Object olusturmak icin
         constructar'in sart oldugunu bilir.
       2)Java'nin otomatik olarak olusturdugu bu gorunmez constructar'a "default constructor"denir.
       3)Siz kendiniz herhangi bir constructar olusturdugunuzda Java "default constructor"i siler
       4)Bir Class'da birden fazla constructar olabilir.Fakat bu constructar'larin parametreleri farkli olmalidir.
       5)"this" keyword "Bu Class" anlamındadır. "this.price" demek bu Class'daki "price" isimli variable demektir.
         "this.price" syntax'i constructor'ların içinde kullanılır.
       6)Constructer kullanarak variable'lar uzerinde yaptiginiz degisimler sadece Object uzerindeki variable'larin degerlerini degistirir.
         Class daki variable degerlerini degistiremez...

     */
    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord(){

    }

    public HondaAccord(int prace){
        this.price = prace;

    }

    public HondaAccord(int prace,int year){

        this.price = prace;
        this.year = year;
        System.out.println("Honda Accord Constructor");

    }
    public HondaAccord(int prace,int year,String make,String model){
        this.price = prace;
        this.year = year;
        this.make = make;
        this.model = model;

    }
}
