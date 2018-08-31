import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;
import java.util.Scanner;
// import java.util.Long;

public class SumSquaredDivisors {


    public static void main(String[] args){

        NewRange newRange = new NewRange();
        Prompter prompter = new Prompter(newRange);
        System.out.println("++++++++++++++++++");
        System.out.println("WELCOME TO SQUARES");
        System.out.println("++++++++++++++++++");
        System.out.println("Welcome, this program takes a range\n"
        +"of numbers, determines whether the sum of the number's\n" 
        +"squared divisibles is a perfect square...\n");

        System.out.println("LET BEGIN");

        boolean startOver = true;
        while (startOver){
            prompter.promptForLowerBound();
            prompter.promptForUpperBound();

            System.out.println("Here are the resulting squares\n"
            +"between your numbers range!");
            ArrayList<ArrayList<Integer>> result = newRange.listSquared();

            System.out.println(result);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Try a new Range?");
            System.out.println("Type 'yes' or 'no'");
            String repeatResponse = scanner.nextLine();
            if (repeatResponse.equals("no")){
                startOver = false;
            }

        }
        
    }


    

    
  
}
