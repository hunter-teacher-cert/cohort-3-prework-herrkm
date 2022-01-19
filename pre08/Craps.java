import java.io.*;
import java.util.*;

public class Craps{
  
  public static void main(String args[]){
    shoot(2, 6);
    shoot(5, 6);
    shoot(1, 20);
    shoot(5, 4);
  }
  
  public static int roll(int maxRoll){
    Random random = new Random();
    int rollValue = random.nextInt(maxRoll) + 1; //random number between 0 and maxRoll-1; add 1 to yield a value between 1 and maxRoll
    return rollValue;
  }

  public static int shoot(int nDice, int maxRoll){
    int totalRoll = 0;
    for (int i = 1; i <= nDice; i++){
      totalRoll = totalRoll + roll(maxRoll);
    }
    return totalRoll;
  }

  public static boolean round(){ //return true if win, false if lose
    int roll = shoot(2, 6);
    System.out.println("You rolled: " + roll);
    if (roll == 2 || roll == 3 || roll == 12){
      System.out.println("Craps! You lose.");
      return false;
    } else if (roll == 7 || roll == 11){
      System.out.println("Natural! You win!");
      return true;
    } else {
      int point = roll;
    }

    return true;
  }
}