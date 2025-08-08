import java.util.*;
class ROCKPAPERSCISSOR{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random ra=new Random();
        String choice[] = {"rock","paper","scissor"};
        int playerscore =0;
        int computerscore=0;
        int roundtowin=3;
        System.out.println("WELCOME TO ROCK-PAPER-SCISSORS GAME");
        System.out.println("------ BEST OF 5 ------");
        while(playerscore <roundtowin && computerscore<roundtowin){
        System.out.println("SELECT EITHER rock OR paper OR scissor"+","+"ENTER YOUR CHOICE: ");
        String userchoice=sc.nextLine().toLowerCase();
        if(!userchoice.equals("rock") && !userchoice.equals("paper") && !userchoice.equals("scissor") ){
            System.out.println("INVALID! PLEASE CHOOSE EITHER rock OR paper OR scissor");
            continue;
        }
        String computerchoice=choice[ra.nextInt(choice.length)];
        System.out.println("COMPUTER CHOICE IS : "+computerchoice);
        if(userchoice.equals ("rock") && computerchoice .equals ( "rock") || userchoice.equals ( "paper") && computerchoice.equals ( "paper") || userchoice.equals ("scissor") && computerchoice.equals ("scissor")){
            System.out.println("THIS ROUND IS A TIE, NO SCORE IS ADDED");
        }
        else if(userchoice.equals ("rock") && computerchoice.equals ("paper")){
            System.out.println("ONE POIN TO COMPUTER");
            computerscore++;
        }
        else if(userchoice.equals ( "rock") && computerchoice.equals ("scissor")){
            System.out.println("ONE POINT TO YOU");
            playerscore++;
        }
        else if(userchoice.equals ("paper") && computerchoice.equals ("rock")){
            System.out.println("ONR POINT TO YOU");
            playerscore++;
        }
        else if(userchoice.equals ("paper") && computerchoice.equals ("scissor")){
            System.out.println("ONE POINT TO COMPUTER");
            computerscore++;
        }
        else if(userchoice.equals ("scissor") && computerchoice.equals ("rock")){
            System.out.println("ONE POINT TO COMPUTER");
            computerscore++;
        }
        else if(userchoice.equals ("scissor") && computerchoice.equals ("paper")){
              System.out.println("ONR POINT TO YOU");
            playerscore++;
        }
        else {
            System.out.println("INVALID! PLEASE CHOOSE EITHER rock OR paper OR scissor");
        }
        
        }
        System.out.println("-----MATCH OVER------");
        if(playerscore > computerscore ){
            System.out.println("YOU WON THE MATCH!");
        }
        else{
            System.out.println("COMPUTER WON THE MATCH,PLEASE TRY AGAIN");
        }
        sc.close();
    }
}