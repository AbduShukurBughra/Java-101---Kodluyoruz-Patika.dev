import java.util.Scanner;

public class AirTemperature {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sicaklik Giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat >= 5 || heat <= 25) {
            if (heat <= 15) {
                System.out.println("Senimaya gidibilirsin.");
            }
            if (heat > 10) {
                System.out.println("Piknige gidebilirsiniz.");
            }
        } else {
            System.out.println("Yuzmeye gidebilirsiniz.");
        }
    }
}
