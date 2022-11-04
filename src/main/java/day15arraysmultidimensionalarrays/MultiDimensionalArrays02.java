package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
    public static void main(String[] args) {

        //MultidimensionelArray kisa yolsan nasil olsuturulur
        char arr[][]={{'a','b'},{'C','D','E'},{'?'}};

        System.out.println(Arrays.deepToString(arr));//[[a, b], [C, D, E], [?]]

        //Example 1: Bir String multidimensional array'de icinde "a" olan elemanlari concole'a yazdiriniz
        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        for (String[] w:brr){
            for (String k:w){
                if (k.contains("a")){
                    System.out.print(k + " ");//learn java easy
                }
            }
        }
    }
}
