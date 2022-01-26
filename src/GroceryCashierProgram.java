import java.util.Scanner;
/* Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL */

public class GroceryCashierProgram {
    public static void main(String[] args) {
        double perPearKgPrice = 2.14, perAppleKgPrice = 3.67, perTomatoesKgPrice = 1.11,
                perBananaKgPrice= 0.95, perAubergineKgPrice = 5;
        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç Kilo : ");
        double pear = input.nextDouble();
        double pear_tl = pear * perPearKgPrice;

        System.out.println("Domates kaç Kilo : ");
        double tomatoes = input.nextDouble();
        double tomatoes_tl = tomatoes * perTomatoesKgPrice;

        System.out.println("Elma kaç Kilo : ");
        double apple = input.nextDouble();
        double apple_tl = apple * perAppleKgPrice;

        System.out.println("Muz kaç Kilo : ");
        double banana = input.nextDouble();
        double banana_tl = banana * perBananaKgPrice;

        System.out.println("Patlıcan kaç Kilo : ");
        double aubergine = input.nextDouble();
        double aubergine_tl = aubergine * perAubergineKgPrice;
        double toplam = pear_tl + tomatoes_tl + apple_tl + banana_tl + aubergine_tl;
        System.out.println("Armut = "+ pear_tl + "TL\nDomates = " + tomatoes_tl + "TL\nElma = " + apple_tl + "TL\nMuz = " + banana_tl + "TL\nPatlican = " + aubergine_tl + "TL");
        System.out.println("Toplam Fiyat = " + toplam + "TL");

    }
}
