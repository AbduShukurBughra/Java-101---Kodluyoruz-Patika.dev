import java.util.Scanner;
/* Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın. */

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        double mass , boy, bodyMassIndex;

        Scanner boyInput = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : " );
        boy=boyInput.nextDouble();
        Scanner massInput = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz : ");
        mass= massInput.nextDouble();
        bodyMassIndex= mass / boy * boy;
        System.out.println("Vücut Kitle İndeksiniz : " + bodyMassIndex );
    }
}

