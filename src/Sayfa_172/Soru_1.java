package Sayfa_172;

import java.util.Arrays;

public class Soru_1 {
    //Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
    //olusturun. Eski array’i yeni haliyle kaydedin.
    public static void main(String[] args) {

        int[] arr={12,15,18,21,24,27,30};

        arr= elemanlariIkiArttir(arr);

        System.out.println(Arrays.toString(arr));


    }
    public static int[] elemanlariIkiArttir(int[] arr){

        for (int i = 0; i < arr.length ; i++) {

            arr[i]= arr[i]+2;


        }
        return arr;
    }

}
