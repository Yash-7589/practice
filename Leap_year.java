import java.util.*;
class Leap_year{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year:");
        int y=sc.nextInt();
        if(y%4==0){
            if(y%100==0){
                if(y%400==0)
                    System.out.println("Leap Year");
                else
                    System.out.println("Not Leap year");
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else
            System.out.println("Not Leap year");
    }
}