package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1:3 den 6 ya kadar tamsayilarin toplamini bulan kodu yaziniz

        int sum=0;
        for (int i=3;i<7;i++) {

            sum=sum + i;
        }
        //Note: System.out.println(sum); loop'un disina yazilirsa "sum"in sadece son degerini ekrana yazdirir
        //System.out.println(sum); loop'un icine yazilirsa her bir lopp için "sum"in hangi degerlerini aldigini yazdirir.
        System.out.println(sum);//18  (son degeri gormek icin loop un disina koyariz ,her loop un sonucunu gormek icin loop un icine koyariz)


        //Example 2:6 dan 3 e kadar tamsayilarin carpimini bulan kodu yaziniz
        int multiply=1;
        for (int i=6;i>2;i--){
            multiply=multiply*i;

        }
        System.out.println(multiply);//360

        //Example 3:Size verilen bir tamsayinin rakamlari toplamini bulunuz

        int num=385;

        num=Math.abs(num);//mutlak deger icin kullanilir
        int sonuc=0;

        for (int i=num;i>0;i=i/10){

           sonuc= sonuc+i%10;

        }
        System.out.println(sonuc);

        //Example 4: Size verilen bir String i ters ceviren kodu yaziniz
        //           "Kaba"==>"abaK"  Interview sorusu

        String str="Kaba";
        //Concatenation yapacaksaniz "" kullanin
        String ters="";

        for (int i=str.length()-1;i>=0;i--) {
            char c=str.charAt(i);
            ters=ters+c;

        }
        System.out.println(ters);


    }
}
