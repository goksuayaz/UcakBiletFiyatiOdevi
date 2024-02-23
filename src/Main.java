import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int km, yas, tip;

        System.out.print("Mesafeyi KM Türünden Giriniz :");
        km = inp.nextInt();

        System.out.print("Yaşınızı Giriniz :");
        yas = inp.nextInt();

        System.out.println("Yolculuk Tipini Giriniz (1=Tek Gidiş, 2=Gidiş/Dönüş :");
        tip = inp.nextInt();

        double normalFiyat, yasIndirimi, tipIndirimi;

        if(km > 0 && yas > 0 && (tip == 1 || tip == 2)){
            normalFiyat = km * 0.10;
            if(yas < 12){
                yasIndirimi = normalFiyat * 0.5;
            }else if(yas >= 12 && yas <= 24){
                yasIndirimi = normalFiyat * 0.10;
                }else if(yas >= 65){
                yasIndirimi = normalFiyat * 0.30;
            }else{
                yasIndirimi = 0;
            }
            normalFiyat -= yasIndirimi;
            if(tip == 2){
                tipIndirimi = normalFiyat * 0.20;
                normalFiyat = (normalFiyat - tipIndirimi) * 2;

            }
            System.out.println("Toplam Tutar: " + normalFiyat + " TL");

        }else{
            System.out.println("Hatalı Veri Girdiniz ");
        }


    }
}