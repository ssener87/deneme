package day13loops_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    //Byte boolean short,int gibi ... containerlar iclerinde sadece tek bir deger barindirabilir.Ancak bazen coklu deger
    //tasimasini istedigimiz containerlara ihtiyac duyariz.Buna Array denir.
    /*
    1)Ayni data tipinde ,coklu data'i depolamak icin Java'nin olusturdugu yapilar vardir
      Bu yapilardan birisi de "Array" lerdir
     */
    public static void main(String[] args) {

        //Array nasil olusturulur?
        int stdAges[]=new int[7];//[0,0,0,0,0,0,0] koyulan sayi kadar 0 koyar

        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdAges));

        //Array'lere elemanlar nasil eklenir?
        stdAges[1]=11;
        stdAges[0]=12;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;
        System.out.println(Arrays.toString(stdAges));//[12, 11, 13, 14, 10, 12, 12]

        //Array'deki herhangi bir elamani nasil yazdirabiliriz?
        System.out.println(stdAges[4]);//10

        //Example 1:Array'deki en kucuk ve en buyuk elamani ekrana yazdiriniz
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));//[10, 11, 12, 12, 12, 13, 14]

        //Note: "length()" String'lerde kullanilir, "lenght" Arraylarda kullanilir.
        int ilk=stdAges[0];
        int son=stdAges[stdAges.length-1];
        System.out.println(ilk+son);//24
        
        //Example 2: stdAges Arrey'i icindeki tum elamanlarin toplamini yazdiran kodu yaziniz

        int sum=0;

        for (int i = 0; i < stdAges.length; i++) {
            sum=sum+stdAges[i];
        }
        System.out.println(sum);//84

        //2.Yol: while-loop

        int i=0;
        int toplam =0;

        while (i<stdAges.length){

            toplam=toplam+stdAges[i];

            i++;
        }
        System.out.println(toplam);//84

        //3.Yol: do-while-loop
        int k=0;

        int s=0;

        do {
            s=s+stdAges[k];
            k++;

        }while (k<stdAges.length);

        System.out.println(s);//84

        //4.Yol:for each loop Array'lerde ve Collections'larda kullanilir
        int t=0;

        for (int w:stdAges){
            t=t+w;
        }
        System.out.println(t);//84

        //Example 3: String bir Array olusturunuz
        //           Bu Array'e 5 tane isim yerlestiriniz
        //           Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz

        String stdNames[]=new String[5];

        stdNames[0]="Ali";
        stdNames[1]="Tom";
        stdNames[2]="Veli";
        stdNames[3]="Kemal";
        stdNames[4]="Cem";

        int karakterSayilariTop=0;

        for (String w:stdNames){

           karakterSayilariTop= karakterSayilariTop+w.length();//String lerde length () kullanilir
        }
        System.out.println(karakterSayilariTop);//18


        //Example 4: Char bir array olusturunuz
        //           Bu Arraya 5 eleman ekleyiniz
        //            Bu Arraydaki sadece buyuk harfleri ekrana yazdiriniz

        char ch[]={'A','c','D','k','m'};

        for (char w:ch){

            if (w>='A' && w<='Z'){
                System.out.print(w);//AD
            }

        }


    }
}
