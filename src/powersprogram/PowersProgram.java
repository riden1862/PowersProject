/*
Riley Denoon
Powers Program
March 11th 2020
 */

package powersprogram;

import java.util.Scanner;

/**
 *
 * @author riden1862
 */
public class PowersProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);
        
        int choice =0; 
        int number =0;
        int power =0;
        int base =0;
        int powerResult =1;
        //state the three options avaliable to the user 
        System.out.println("This is the Powers Program");
        System.out.println("Enter 1 to square a number");
        System.out.println("Enter 2 to cube a number");
        System.out.println("Enter 3 to find the value of a number to a power.");
        System.out.println("Enter 4 to end the program");
        
        //declare that the choice is the keyedinput
        choice = keyedInput.nextInt();
        
        System.out.println("");
        
        //when the choice equals one, prompt the user for the number they
        //want like squared. 
        while (choice !=4)
        {
            if (choice ==1)
            {
            System.out.println("You have chosen to square a number");
            System.out.println("Please enter the number you would like squared");
            //use the scanner to find the number they want squared. 
            number = keyedInput.nextInt();
            //
                 for( int i =1; i <= 1; i ++ ){
                 //print the value of i (the number squared)
                 number = number * number; 
            }
            System.out.println(number); 
            }
            
            if (choice ==2)
            {
            System.out.println("You have chosen to cube a number");
            System.out.println("Please enter the number you would like to cube");
            //use a scanner to find the value of the number they want to cube
             number = keyedInput.nextInt();
                 for (int i=1; i<=1; i++){
                //print the value of i, (the number cubed)
                number = number * number * number;
                 }
            System.out.println(number);
            }
            
            if (choice ==3) 
            {
            System.out.println("You have chosen to find the value of any number to the power of a number");
            System.out.println("Please enter the base value");
            //use a scanner to determine the number they would like as the base.
            base = keyedInput.nextInt();
            System.out.println("Please enter the power value");
            //use a scanner to get the number they want for the power.
            power = keyedInput.nextInt();
                for (int i=1; i<= power; i++){
                     powerResult = base * powerResult;     
                 }
            System.out.println("The result is " + powerResult);
            }
            
            
        System.out.println("This is the Powers Program");
        System.out.println("Enter 1 to square a number");
        System.out.println("Enter 2 to cube a number");
        System.out.println("Enter 3 to find the value of a number to a power.");
        System.out.println("Enter 4 to end the program");
            
        //declare that the choice is the keyedinput
        choice = keyedInput.nextInt();
            }
        
         //while (choice ==4) {
          //  System.out.println("This is the end of the program.");
        //}
    }
       
}
     
    
