package day03typecastingwrapperscanner;

public class WrapperClass01 {
    public static void main(String[] args) {

        /*
        Java primitive lere methodlar ekleyerek yeni bir
        yapi olusturdu,bu yapiya "Wrapper Class" denir

        Primitive               Wrapper
          byte         ==>        Byte
          short        ==>         Short
          **  int      ==>       Integer
          long         ==>        Long
          float        ==>        Float
          double       ==>       Double
          boolean      ==>       Boolean
          ** char      ==>        Character

         */

        byte prmitiveByte=12; //"primitiveByte" yazip nokta koydugunuzda hic method goremezsiniz,
                              //cunku primitive'ler method icermez sadece deger icerir



        Byte wrapperByte=12;//"wrapperByte" yazip nokta koydugunuzda bir cok method gorursunuz,
                            // cunku "wrapper" lar method icerir


        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//127

        //Example 2: short, int, long data type'larinin en buyuk ve en kucuk degerlerini ekrana yazdiriniz

        System.out.println(Short.MIN_VALUE);//-32767
        System.out.println(Short.MAX_VALUE);//32767

        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);//2147483648


        System.out.println(Long.MIN_VALUE);//-9223372036854775808
        System.out.println(Long.MAX_VALUE);// 9223372036854775807


        //"primitive'ler nasil "wrapper" lara cevrilir
        float f1=13.9F;
        Float wrapperF1=f1;

        //"wrapper"lar nasil "primitive"lere cevrilir

        Character w1='s';
        char primiveW1=w1;

        //Note: Auotoboxing ve Unboxing Java tarafindan otomatik olarak yapilir



    }
}
