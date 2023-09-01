import java.util.Random;
import java.util.Scanner;

public class Guess_Number {
    public static void main(String[] args) {
        Random r=new Random();
        int n=r.nextInt(100);
        Scanner sc=new Scanner(System.in);
        int chances=10;
        int i=1;
        while(i<=chances){
            System.out.println("Enter the Number");
            int num=sc.nextInt();
            if(num==n){
                System.out.println("You Guessed it right in: "+ i + " attempts");
                break;
            }
            else if(num>n){
                System.out.println("higher than the number try again");
                i++;
            }
            else{
                System.out.println("Lower than the number try again");
                i++;
            }
        }
        if(i>chances)
            System.out.println("No of attempts reached, You failed");

    }
    
}