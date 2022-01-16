import java.util.Scanner;

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
