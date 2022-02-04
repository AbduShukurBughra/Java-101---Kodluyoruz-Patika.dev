import java.util.Scanner;

public class PassingClassStatus {
    public static void main(String[] args) {
        int maths, physics,turkish, chemical, music;

        Scanner input = new Scanner(System.in);

        System.out.println("Your Math score is : ");
        maths=input.nextInt();

        System.out.println("Your Physics score is : ");
        physics=input.nextInt();

        System.out.println("Your Turkish score is : ");
        turkish=input.nextInt();

        System.out.println("Your Chemical score is : ");
        chemical=input.nextInt();

        System.out.println("your Music score is : ");
        music=input.nextInt();

        double avarage=(maths + physics + turkish+ chemical + music) / 5;
        if(avarage <= 55){
            System.out.println("You lose , see you again next year...");
        }else{
            System.out.println("Congratulations ... ");
        }
        System.out.println("Your Avarage is : "+ avarage);
    }
}
