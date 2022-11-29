package Sayfa_195;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru_1 {
    //Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
    //elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.
    public static void main(String[] args) {
        int[] arr = {1,2,9,4,8,3,5,7,3,6,8,5,2,9,5,1,2,7,4,5,8,3,9,4,5};
        System.out.println(tekrarEdenElemanlariSil(arr));
    }
    public static List<Integer>tekrarEdenElemanlariSil(int []arr){

        List<Integer>tekrarsizListe=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            if (!tekrarsizListe.contains(arr[i])){
                tekrarsizListe.add(arr[i]);
                Collections.sort(tekrarsizListe);
            }
        }
        arr=new int[tekrarsizListe.size()];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=tekrarsizListe.get(i);
        }
          return tekrarsizListe;
        }
    }



