import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("1. sayi : ");
        a= input.nextInt();

        System.out.println("2. sayi: ");
        b= input.nextInt();

        System.out.println("3. sayi: ");
        c=input.nextInt();

        if((a>b)&&(a>c)){
            if (b>c){
                System.out.println("a>b>c");
            }else if (c>b){

            }
        }
    }
}
