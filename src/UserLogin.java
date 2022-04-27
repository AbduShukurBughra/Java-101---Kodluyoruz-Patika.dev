import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName;
        String password;

        Scanner input= new Scanner(System.in);
        System.out.println("Kullanici Adiniz : ");
        userName=input.nextLine();

        System.out.println(" Sifreniz : ");
        password=input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giris Yaptiniz ! ");
        }else{
            System.out.println("Bilgileriniz Yanlis !");
        }
    }
}
