import java.util.Random;
import java.util.Scanner;
public class Test2{
    public static void main(String[]args){
        Random rand_num=new Random();
        int corr_guess=rand_num.nextInt(100);
        int turns=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess a number between 1 to 100");
        System.out.println("You have 10 turns");
        
        int guess;
        int a=0;
        boolean vic=false;
        while(vic==false){
            guess=sc.nextInt();
            turns++;
            
        if(guess==corr_guess){
            vic=true;
        }
        else if(a>8){
            System.out.println("You have lost, the right answer is:"+corr_guess);
            return;
        }
        else if(guess<corr_guess){
            a++;
            System.out.println("Your guess is lower than the correct answer, turns left: "+(10-a));
        }
        else if(guess>corr_guess){
            a++;
            System.out.println("Your guess is higher than the correct answer,turns left: "+(10-a));
        }
        }
        System.out.println("You won");
        System.out.println("Then number was"+corr_guess);
        System.out.println("You used "+turns+" turns to guess the right answer");
        System.out.println("You score is "+((11-turns)*10)+" out of 100");
    }
}