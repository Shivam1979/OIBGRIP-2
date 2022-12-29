import java.util.Scanner;
import static java.lang.Math.*;

public class geuss_game {

    //function which implement the number guessing game
    public static void guessingNumbergame() {
        //scannner class
        Scanner sc =new Scanner(System.in);
        //generate the numbers
        int number =(1 + (int) (100 * random()));

        int N= 10;
        int i,guess;
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("A number is chosen between 1 to 100 Guess the number within 10 trials.");
        System.out.println("---------------------------------------------------------------------------");
        // iterate over N trials
        for (i=1;i<N; i++){
            System.out.println("Guess the number ❓❓❓:  ");
            // take input for guessing
             guess =sc.nextInt();
             if (guess<=0 || guess>100){
                 System.out.println("Your guess is invalid \uD83D\uDCAD\uD83D\uDCAD ");
                 //if the number is guessede
             }else if (number == guess){
                 System.out.println("Congratulations! you won\uD83C\uDFC6\uD83C\uDFC6!");
                 System.out.println("You guessed number in " +i+ " Guesses❤❤❤");
                 break;
             } else if (number>guess) {
                 System.out.println("Nope! The number is  greater than " + guess+ ". Guess again");
             }else {
                 System.out.println("Nope! The number is less than "+ guess+".Guess Again.");
             }
        }
        if (i==N)
        {
            System.out.println("You ran out of tries .\n You lose!");
            System.out.println("The number was "+ number);
        }

    }

    public static void main(String[] args) {
        //function call
        guessingNumbergame();
    }
}
