package day47_linkedList;

import java.util.HashSet;
import java.util.Set;

public class C04_ArrayTekrarlariSilme {
    public static void main(String[] args) {
        //verilen bir arrayden tekrar eden elementleri silip unique elementler olusan bir array
        //haline donduren bir method olusturun

        int arr[] = {3, 5, 4, 6, 3, 1, 2, 7, 8, 6, 1, 4, 2, 8};

        arr = benzersizYap(arr);

    }

    private static int[] benzersizYap(int[] arr) {

        Set<Integer> benzersizSet = new HashSet<>();
        for (Integer each :arr){

        }


        return arr;
    }

}