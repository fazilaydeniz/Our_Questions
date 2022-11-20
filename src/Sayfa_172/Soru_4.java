package Sayfa_172;

public class Soru_4 {
    //Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
    //kullanildigini yazdiran bir method olusturun.

    public static void main(String[] args) {

        int [] arr= {1,2,3,1,4,1,6,5,1,7,1,5,9,2,1,8,};
        int arananEleman=2;
        int sayac=0;

    elemanArama(arr,arananEleman);

    }

    public static void elemanArama(int[]arr, int arananEleman){
                  int sayac=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==arananEleman){
                sayac++;
            }

        }
        System.out.println("Aradığınız eleman array'de " + sayac + " tane geçmektedir");
    }

}
