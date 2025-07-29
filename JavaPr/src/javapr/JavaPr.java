//Guess Number Tiny Game
package javapr;
import java.util.Random;
import java.util.Scanner;
public class JavaPr {
    public static void main(String[] args) {
        Random random=new Random();
        int theNum=random.nextInt(10)+1;
        Scanner sc=new Scanner(System.in);
        int guess;
        int count=0;
        boolean result=false;
        System.out.println("Welcom to the game");
        System.out.println("Guess a numbet between 1 to 10");
        System.out.println("You have 5 shots");
        while(!result){
            if (sc.hasNextInt()){
                if (count>=5){
                    break;
                }
                
                guess=sc.nextInt();
                if(guess>10 || guess<1){
                    System.out.println("please choose between the range.");
                    
                }
                count++;
                if(guess<theNum){
                    System.out.println("Go Higher!");
                }
                else if(guess>theNum){
                    System.out.println("Try a lower number!");
                }
                else{
                    System.out.println("Congratulation!You made it (: ");
                    result=true;
                }
            }else{
                System.out.println("Invalid entry.Try again.");
                break;
                
            }
        }
        sc.close();
        System.out.println("End of Game.Thanks for playing ^-^");
    }
    
}
