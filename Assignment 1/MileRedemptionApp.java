//Name: Sean Mertens
//ZID: Z1630956
//MileRedemptionApp.java
/*Main class MileRedemptionApp, has the main() method which 
 contains the loop for user interaction. Gets the command
 line argument, use the filename to create the Scanner object, creates 
 an instance of MileRedeemer, tells it to read in the destination 
 data, gets the city names and print them out, reads the data input 
 from the user, uses redeemMiles() to get the list of tickets that may be 
 redeemed, and getRemainingMiles() to get the miles remaining.*/

//import statements, pretty self-explanatory
import java.io.*;
import java.util.Scanner;
import static java.lang.System.exit;

//////////////////////////////
//class MileRedemtionApp    //
//It's our main driver prog //
//////////////////////////////
public class MileRedemptionApp
{
  public static void main(String [] args) throws IOException
  {
    Scanner fileScanner;//Scanner for reading in miles.txt
    Scanner input = new Scanner( System.in );//Scanner for reading in command line input
    int miles = 0;//User's amount of redeemable miles 
    int month = 0;//Desired month of departure 
    
    if (args.length > 0)//If an argument of any length is detected
    {
      fileScanner = new Scanner(new File(args[0]));//Read in miles.txt as an argument
      MileRedeemer m = new MileRedeemer();//Create m, a new MileRedeemer object
      m.readDestinations(fileScanner);//Use the methods we've coded in MileRedeemer.java
      System.out.println( "List of destination cities you can travel to: " );//Output format header
        // print the city names that we can travel to
        for(String str : m.getCityNames())
        {
        System.out.println(str);
        } 
		//this string declaration is for our do/while
		//it gives the y/n question functionality
        String ans="";
        do
        {
          try//try portion of try/catch block to handle an input mismatch exception
          {            
            System.out.print( "Please input your total accumulated miles: " );//Prompt user for their miles
            miles = input.nextInt(); //"miles" = the user's input
            System.out.print( "Please input your month of departure (1-12): " );//Prompt user for their month of departure
            month = input.nextInt();//"month" = the user's input
            System.out.println( "Your accumulated miles can be used to redeem the following tickets: " );//Output format header
              // pass miles and month to our redeemMiles code
              for(String str2 : m.redeemMiles(miles,month))
              {
                System.out.println(str2);
              }  
            System.out.println( "Your remaining miles: " + m.getRemainingMiles());//Output format header
          }  
          catch (Exception e)//catch portion of try/catch block to handle an input mismatch exception
          {
          System.out.println("Exception occurred - wrong input type detected!");//System error message to handle exception
          ans = input.next( );//"ans" = the user's input
          }     
          System.out.print( "Do you want to continue (y/n)? " );//Prompt user to continue or quit
          ans = input.next( );//"ans" = the user's input
        }while(ans.equals("y")||ans.equals("Y"));//if the user doesn't answer Y or y, quit
    }
  }
}
    
     