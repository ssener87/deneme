package day02methodcreation;

public class MethodCreation {

    //main method icinde kullancagimiz hersey "static" olmalidir.
    public static void main(String[] args) {

        //void: Bu method yeni bir data uretmiyor demektir.
        //Ornegin; ekrana bir sey yazdirma methodu, bit tusa tiklama methodu gibi…

        System.out.println(toplamaYap(1.2,5));

        System.out.println(ucSayiyiCarp(2,1.5,6));

        System.out.println(ilkIkiSaiyiToplaÜcüncüIleCarp(2,8,3.2));

        //sout yazip "Enter" a basiniz System.out.println() otomatik olarak yazilir.
        //Ekrana bir şey yazdirmak icin iki tane kod var 1)System.out.println()==> satirbasi yapar. 2)System.out.print() ==>satirbasi yapmaz


    }

    //Example 1: Toplama islemi yapan bir method olusturunuz
    public static double toplamaYap(double a, double b){

        return a+b;

    }

    //Example 2: Uc sayiyi birbiri ile carpan bir method olusturunuz
    public static double ucSayiyiCarp(double a,double b, double c){

        return a*b*c;

    }

    //Example 3: Uc sayidan ilk ikisini toplayip ucuncusunu carpan sonucu ekrana yazdiriniz.

    public static double ilkIkiSaiyiToplaÜcüncüIleCarp(double x,double y,double z){
        return (x+y)*z;
    }


}
