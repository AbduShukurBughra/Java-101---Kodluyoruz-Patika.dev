import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz : ");
        n1= input.nextInt();
        System.out.println("ilk sayiyi giriniz : ");
        n2= input.nextInt();

        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.println("Seçminiz : ");
        select=input.nextInt();

        switch(select){
            case 1:
                System.out.println("Toplama : " + (n1+n2));
                break;
            case 2:
                System.out.println("Cikarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma : " + (n1*n2));
                break;
            case 4:
                if(n2!=0){
                    System.out.println("Bolme : " + (n1/n2));
                    break;
                }else{
                    System.out.println("Bir sayi 0'a bolunemez !");
                }
            default:
                System.out.println("Yanlis secim. Tekrar Deneyiniz");
        }

    }
}
