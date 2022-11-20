package Sayfa_145;

public class Soru_1 {
    //While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
    //yazdirin.
    public static void main(String[] args) {
           int sayi=10;

           while (sayi <=99) {

            for (int i = 10; i <=99; i++) {

                if (i % 7 == 0) {

                    System.out.println(i + " ");
                }

            }
                      break;
        }
        System.out.println("");
    }
}
