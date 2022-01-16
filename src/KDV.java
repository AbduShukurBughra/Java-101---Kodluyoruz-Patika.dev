import java.util.Scanner;
/*KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV
tutarı hesaplayan programı yazınız.
 */

public class KDV {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ucret Tutarini Giriniz: ");
        tutar= input.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar+ kdvTutar;

        System.out.println("KDVsiz Tutar : "+tutar);
        System.out.println("KDV Orani : "+kdvOran);
        System.out.println("KDV Tutar : "+kdvTutar);
        System.out.println("KDVli Tutar : "+kdvliTutar);
    }

}
