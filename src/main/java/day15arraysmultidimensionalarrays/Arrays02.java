package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 1: Size verilen pozitif ve negatif sayilar iceren bir integer arary'deki "en buyuk negatif" ve "en kucuk pozitif" elemani bulunuz.

        int arr[] = {-12, 18, -5, 23, -2, 0};

        Arrays.sort(arr);

        int mxNegative = arr[0];
        int minPositive=arr[arr.length-1];

        for (int w : arr) {

            if (w < 0) {
                mxNegative = Math.max(mxNegative, w);
            }
            if (w>0){
                Math.min(minPositive,w);
            }

        }
        System.out.println("En buyuk negatif: " + mxNegative );
        System.out.println("En kucuk pozitif: " + minPositive );


    }
}
