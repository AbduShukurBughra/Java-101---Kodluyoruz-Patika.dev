import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        // Değişkenler tanımlandı ve veri girişi için scanner kodu kullanıldı.

        double  a, b, c;
        Scanner input = new Scanner(System.in);

        // Dik üçgenin 1. ve 2. kenarı kullanıcıdan istendi.
        System.out.print("Diküçgenin 1. kenarını giriniz :");
        a = input.nextDouble();

        System.out.print("Diküçgenin 2. kenarını giriniz :");
        b = input.nextDouble();

        // Hipotenüs hesaplandı.
        c = Math.sqrt ((a*a)+(b*b));
        System.out.println("Hipotenüs :" + c);


        // Üçgen alanını bulma
        System.out.println("Bir Üçgenin Alanının Hesaplaması");

        // Üçgenin kenarları kullanıcıdan istendi.
        System.out.print("Üçgenin 1. kenarını giriniz :");
        a = input.nextInt();

        System.out.print("Üçgenin 2. kenarını giriniz :");
        b = input.nextInt();

        System.out.print("Üçgenin 3. kenarını giriniz :");
        c = input.nextInt();

        // Hesaplamalar için değişkenler oluşturuldu.
        double alan, u;

        // Hesaplamalar yapıldı ve üçgenin alanı ekrana bastırıldı.
        u=(a+b+c)/2;
        alan = Math.sqrt (u*(u-a)*(u-b)*(u-c));

        System.out.print("Üçgenin alanı :" + alan);
    }
}
