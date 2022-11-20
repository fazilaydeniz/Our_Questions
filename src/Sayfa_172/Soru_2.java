package Sayfa_172;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_2 {
    //Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
    //method yaziniz.

        public static void main(String[] args) {
            int [] arr= {1,3,-4,-1,6,4,8,-3,5};

           System.out.println(sayilariTopla(arr));
        }
    public static int sayilariTopla(int[]arr){
          int toplam=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>0) {
                toplam += arr[i];
            }
        }
        return toplam;
    }
}
