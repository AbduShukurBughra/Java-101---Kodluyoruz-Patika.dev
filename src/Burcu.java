import java.util.Scanner;

public class Burcu {
    public static void main(String[] args) {
        int month, day;
        String burcu="";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Dogdunuz ay : ");
        month=input.nextInt();

        System.out.println("Dogdunuz gun : ");
        day=input.nextInt();

        switch(month){
            case 1:
                if(day>=1 && day<=31){
                    if(day<22){
                       burcu="Oglak";
                    }else{
                        burcu="Kova";
                    }
                }else{
                    isError = true;
                }
                break;
            case 2:
                if(day>=1 && day<=28){
                    if(day<2){
                        burcu="Oglak";
                    }else{
                        burcu="Kova";
                    }
                }else{
                    isError = true;
                }
                break;
            default:
                System.out.println("Hatali bir ay girdiniz !");
        }
    }
}
