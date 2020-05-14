//Name: Alberto Pizano
//DigitDisplay.java
/*Class that assists in sorting Destination objects by 
 * their normal mileage.*/

//import statements
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////
//Class DigitDisplay                                                //
//reads in an integer as input and displays it digit by digit       //
//////////////////////////////////////////////////////////////////////
class DigitDisplay
{
  public static void main(String [] args)
  {
    System.out.print( "Please input a 4-digit integer value: " );//Prompt user for input
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
      if ( i > 1 && i <= 9999 )  
      {
        int Remainder4 = i%10000;  
  
        int Four = Remainder4/1000;  
  
        int Remainder3 = Remainder4 % 1000;  
  
        int Three = Remainder3/100;  
  
        int Remainder2 = Remainder3 % 100;  
  
        int Two = Remainder2/10;  
  
        int Remainder1 = Remainder2 % 10;  
  
        int One = Remainder1/10;  
  
        int Remainder0 = Remainder1 / 1;  
  
        int Zero = Remainder0;  
  
        System.out.printf("%d\n", Four);// /n is the "newline" operator, which starts a new line after each digit  
        System.out.printf("%d\n", Three);  
        System.out.printf("%d\n", Two);  
        System.out.printf("%d", Zero);  
      }
      else
      System.out.print( "Invalid integer! " );//Error message
  }
}