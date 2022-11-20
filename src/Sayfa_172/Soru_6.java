package Sayfa_172;

public class Soru_6 {
    //Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
    //olusturun.

    public static void main(String[] args) {
        String [] arr = { "Ali", "Veli", "Ayşe","Hasan", "Melahat","Hüsamettin"};

        enKısaEnUzunIsim(arr);

        }
        public static void enKısaEnUzunIsim(String [] arr){
        String enKısaIsim=arr[0];
        String enUzunIsim=arr[0];

            for (int i = 0; i < arr.length ; i++) {

                if (arr[i].length()<= enKısaIsim.length()){
                    enKısaIsim=arr[i];


                }if (arr[i].length()>= enUzunIsim.length()){
                    enUzunIsim=arr[i];
                }

            }
            System.out.println(enKısaIsim);
            System.out.println(enUzunIsim);
        }

}
