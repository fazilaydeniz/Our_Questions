package Sayfa_187;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru_1 {
    /*
     //Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
     //elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
     //int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};
      */
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,3,9,6,5,3,5,2,5,1,2,4,5,7,3,4,5};
        System.out.println(tekrarEdenElementleriSilme(arr));

    }
    public static List<Integer> tekrarEdenElementleriSilme(int [] arr){
        List<Integer> tekrarsizListe= new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            if (!tekrarsizListe.contains(arr[i])){
                tekrarsizListe.add(arr[i]);
                Collections.sort(tekrarsizListe);
            }
        }
        arr= new int[tekrarsizListe.size()];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=tekrarsizListe.get(i);
        }
        return tekrarsizListe;
    }


}
