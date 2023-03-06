package GameProject;

import java.util.Scanner;

class Guesser{
    public int guess_no;
    public int guess()
    {
        System.out.println("Hi! Gusser enter the number");
        Scanner scan = new Scanner(System.in);
        guess_no = scan.nextInt();
        return guess_no;
    }
}

class Player{
    int guessno;
    public int guessingno()
    {
        
        Scanner scan = new Scanner(System.in);
        guessno = scan.nextInt();
        return guessno;
    }
}

class Umpire{
    public int numberby_guesser;
    public int numberby_player1;
    public int numberby_player2;

    public void FromGuesser()
    {
        Guesser g = new Guesser();
        numberby_guesser=g.guess();        
    }

    public void FromPlayer()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        System.out.println("Hi! Player1 guess your number");
        numberby_player1 = p1.guessingno();
        System.out.println("Hi! Player2 guess your number");
        numberby_player2 = p2.guessingno();
    }

    public int compare()
    {
        FromGuesser();
        FromPlayer();
        if(numberby_guesser == numberby_player1)
        {
            if(numberby_guesser == numberby_player1 && numberby_guesser == numberby_player2)
            {
                return 1;
            }else{
                return numberby_player1;
            }
            
        }
        else if(numberby_guesser == numberby_player2)
        {
            return numberby_player2;
        }else{
            System.out.println("Both Players and Guesser answers are not matched");
            return 0;
        }
    }
    
}

public class Gusser_Game {
    public static void main(String[] args)
    {
        Umpire u = new Umpire();
        int result=u.compare();
        if(result == 1)
        {
            System.out.println("Both person  is right");
        }
        else if(u.numberby_player1 == result)
        {
            System.out.println("Player1 has won the game");
        }
        else if(u.numberby_player2 == result){
            System.out.println("Player2 has won the game");
        }
    }
}
