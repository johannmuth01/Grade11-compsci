/* Hangman Assignment
 * Plays a Computer job themed game of hangman
 * Johann Muth
 * Feb 21 2018
 * ___________
 *   |        |
 *  ( )       |
 *   |        | 
 * -- --      |
 *   |        |
 *  / \       |
 *            |
 *       _____
 */

// Import class, initialize program and variables
import java.util.Scanner;
class Hangman {
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    /*String[] career;
    career = new String[15];
    career[0]="PROGRAMMER";
    career[1]="SOFTWARE_ENGINEER";
    career[2]="TEACHER";
    career[3]="DEVELOPER";
    career[4]="DATABASE_ADMINISTRATOR";
    career[5]="HARDWARE_ENGINEER";
    career[6]="SYSTEMS_ANALYST";
    career[7]="NETWORK_ARCHITECT";
    career[8]="WEB_DEVELOPER";
    career[9]="SECURITY_ANALYST";
    career[10]="SYSTEMS_MANAGER";
    career[11]="PROJECT_MANAGER";
    career[12]="DATA_SCIENTIST";
    career[13]="APP_DEVELOPER";
    career[14]="MACHINE_LEARNING_RESEARCHER";
    String answer = career[(int)(Math.random()*14)];*/
    String guess;
    int numLetters;
    int counter = 0;
    String guessWord = "";
    // test with programmer
    numLetters = answer.length();
    for(int i=1; i <= numLetters;i++){
      if(answer.substring(i,i+1).equals("_")){
        guessWord=guessWord+"_";  
      } else{ 
        guessWord = guessWord + "-";
      }
    }
    
    while(!guessWord.equals(answer)&&counter<4){
      System.out.println("Guess a letter");
      guess=input.next();
      guess=guess.toUpperCase();
      if(guess.length()==numLetters){
        if (guess.equals(answer)){
          guessWord=guess;
        } else {
          counter=4;
        }
      }
      if (answer.indexOf(guess)==(-1)){
        System.out.println("Incorrect");
        counter++;
      }
      
      if (guess.length()==1 && guessWord.indexOf(guess)!=-1) {
        System.out.println("You already guessed that!");
        counter++;
      }
      
      for(int i=0; i < numLetters;i++){
        
        if (guess.equals(answer.substring(i,i+1))) {
          guessWord=guessWord.substring(0,i)+guess+guessWord.substring(i+1,numLetters);
        } 
        
      }
      System.out.println(guessWord);  
      
      if (guessWord.equals(answer)){
        System.out.println("Congratulations!");
        counter=0;
      }
      if (counter>=4) {
        System.out.println("Game over");
        System.out.println("                                                                           ___________");
        System.out.println("                                                                             |        |");
        System.out.println("                                                                            ( )       |");
        System.out.println("                                                                             |        |");
        System.out.println("                                                                           -- --      |");
        System.out.println("                                                                             |        |");
        System.out.println("                                                                           _| |_      |");
        System.out.println("                                                                                      |");
        System.out.println("                                                                             _________|");
      } else if (counter==1) {
        System.out.println("                                                                           ___________");
        System.out.println("                                                                             |        |");
        System.out.println("                                                                            ( )       |");
        System.out.println("                                                                             |        |");
        System.out.println("                                                                                      |");
        System.out.println("                                                                                      |");
        System.out.println("                                                                                      |");
        System.out.println("                                                                                      |");
        System.out.println("                                                                             _________|");
      } else if (counter==2) {
        System.out.println("                                                                           ___________");
        System.out.println("                                                                             |        |");
        System.out.println("                                                                            ( )       |");
        System.out.println("                                                                             |        |");
        System.out.println("                                                                           -- --      |");
        System.out.println("                                                                                      |");
        System.out.println("                                                                                      |");
        System.out.println("                                                                                      |");
        System.out.println("                                                                             _________|");
      } else if (counter==3) {
        System.out.println("                                                                           ___________");
        System.out.println("                                                                             |        |");
        System.out.println("                                                                            ( )       |");
        System.out.println("                                                                             |        |");
        System.out.println("                                                                           -- --      |");
        System.out.println("                                                                             |        |");
        System.out.println("                                                                                      |");
        System.out.println("                                                                                      |");
        System.out.println("                                                                             _________|");
      } 
    }
  }
}
