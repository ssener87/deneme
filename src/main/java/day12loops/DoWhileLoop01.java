package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //while loop bazi durumlarda hic calismayabilir. Yani while loop icin "zero execution" mumkundur
        int i=1;

        while (i<1){
            System.out.println("While Loop");

            i++;

        }
        //do-while loop kullandiginizda loop bady si icindeki kod en az bir kere calisir. Yani do-while loop icin  "zero execution" mumkun degildir.
        int k=1;

        do {

            System.out.println("do-while loop");
            k++;
        }while (k<1);


        //Example 1: Bir ondalikli sayinin ondalik kismindaki rakamlarin toplamini bulunuz.
        //           24.5673 ==> 5+6+7+3=21

        double num=24.5673;
        System.out.println(num);//24.5673

        //String.valueOf() method'u parantezin icine konulan data'nin tipini String yapar
        String str=String.valueOf(num);
        System.out.println(str);//24.5673

        //Regex icin nokta kullandiginizda onune "\\" koyunuz. "\\"seklinde kullanilir.
        String decimalPart=str.split("\\.")[1];
        System.out.println(decimalPart);//5673

        int decimalInt=Integer.valueOf(decimalPart);//decimalPart virgulden sonraki kisim demek
        System.out.println(decimalInt);//5673

        int sum=0;

        do {

            sum=sum+decimalInt%10;

            decimalInt=decimalInt/10;

        }while (decimalInt>0);

        System.out.println(sum);



    }
}
