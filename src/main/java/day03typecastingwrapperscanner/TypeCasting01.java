package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting: Bir numeric data type'ini diger numeric type'ina cevirmek demektir.
    //              byte < short < int < long < float < double

    // "Auto Widening": Otomatik genisletme
    //  "Explicit Narrowing" :Acıkca daraltma

    // Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
    // Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir

    public static void main(String[] args) {

        byte age=23;
        int newAge=age;

        long population=1234;
        int newPapilation=(int) population;

        //Example 1: short'u double'a ceviren kodu yaziniz

        short numOfStudents=235;
        double newNumOfStudents=numOfStudents;

        // Example 2:float'i byte yapan kodu yaziniz.

        float price=12.99F;
        byte newPrice=(byte)price;

        System.out.println(newPrice);//12 ==> Java ondalik sayiyi, tam sayiya cevirirken yuvarlama islemi yapmaz.
                                    //       Java ondalik sayiyi, tam sayiya cevirirken ondalik kismini siler.

        int number = 515;
        byte newNumber = (byte) number;
        System.out.println(newNumber);//3 ==> Java 515'i 256(byte'daki sayıların sayısı)'ya böldü kalanı return etti.

        int num = 510;
        byte newNum = (byte)num;
        System.out.println(newNum);// -2





    }
}
