package day16multidimensionalarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    /*
    ArayLists'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.\
    Array ile ArrayList'in farki nedir?
    1) Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz,
    soyledigimiz eleman sayisindan fazla eleman koyamayiz.
    Array'ler eleman sayisinda "fixed" dirler.
      ArrayList'leri olusturuken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible"(esnek)dirler
    2)Array'lerin icine "primitive" ve "reference"(adres) ler konulur
      ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
    3)Array'ler super fast,cok hizli. Array'ler memory'i cok az kullanir
      Note: Eleman sayisi kesin belli olan coklu data'lari depolamak icin Array kullaniriz.
            Eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin.

     */
    public static void main(String[] args) {

        //ArrayList nasil olusturulur?
        //1.Yol:
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2.Yol:
        ArrayList<Integer> heigts = new ArrayList<>();
        //3.Yol:
        List<Integer> nums = new ArrayList<>();

        //ArrayList'ler nasil yazdirilir?
        System.out.println(nums);//[]

        //ArrayList'lere nasil eleman eklenir?
        //add() her zaman en sona ekler. (insertion order)
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);//[21, 18, 20]

        nums.add(1, 50);//araya rakam koymak icin kullanilir
        System.out.println(nums);//[21, 50, 18, 20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums);//[21, 50, 18, 20, 23, 185]
        System.out.println(prices);//[23, 185]

        nums.addAll(2, prices);//[23, 185]
        System.out.println(nums);//[21, 50, 23, 185, 18, 20, 23, 185]

        //ArrayList'lerin eleman sayisi nasil bulunur?
        //ArrayList'lerde eleman sayisini bulmak icin size() kullanilir, Array'lerde ise length() kullanilir
        int elemanSyisi = nums.size();
        System.out.println(elemanSyisi);//8

        //ArrayList'lerde herhangi bir eleman nasil secilir?
        //get() methodu istenen bir index'teki elemani verir.
        int eleman1 = nums.get(3);
        System.out.println(eleman1);//185

        //ArrayList'in bos olup olmadigini nasil anlariz?
        boolean bos1 = nums.isEmpty();
        System.out.println(bos1);//false

        boolean bos2 = ages.isEmpty();
        System.out.println(bos2);//true

        //ArrayList'de bir eleman nasil degistirilir?
        nums.set(3, 200);
        System.out.println(nums);//[21, 50, 23, 200, 18, 20, 23, 185]

        //Example 1: nums ArrayList'indeki tum tek sayilari 11 arttirdiktan sonra ekrana yazdiriniz?

        for (int w : nums) {

            if (w % 2 != 0) {

                nums.set(nums.indexOf(w), w + 11);
            }
        }
        System.out.println(nums);//[32, 50, 34, 200, 18, 20, 34, 196]

        //remove() methodunun icine tamsayi koyarsaniz Java onu index olarak kabul eder.

        //Example 2: ArrayList'den 34 elemaninin ilk gorunumunu siliniz?
        //Note1: Tum tamsayilar Java icin aksi soylenmedikce primitive'dir,yani int'dir.
        //Note2: "primitive"ler ArrayListlerin elemani olamazlar.
        //Note3: "primitive"leri "Wrapper Class"a cevirirseniz non-primitive olur ve non-primitive'ler ArrayList'lerin elemani olur,index olmaz.
        Integer sayi=34;
        nums.remove(sayi);
        System.out.println(nums);//[32, 50, 200, 18, 20, 34, 196]

    }
}
