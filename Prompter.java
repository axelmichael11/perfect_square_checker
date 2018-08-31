import java.util.Scanner;

public class Prompter {
    private NewRange newRange;

    public Prompter(NewRange newRange){
        this.newRange = newRange;
    }


    public void promptForLowerBound(){
        Scanner scanner = new Scanner(System.in);
        // long newNumber = 234324L;
        boolean lowerBoundAcceptable = false;
        long result = 0;

            do {
                System.out.println("Lower Bound?:");
                String lowerBound = scanner.nextLine();
                
                try {
                    result = Long.parseLong(lowerBound);
                    lowerBoundAcceptable = true;
                } catch(IllegalArgumentException iae) {
                    System.out.printf("%s. You idiot. That is not a number. %n",
                                    iae.getMessage());
                }
        } while(!lowerBoundAcceptable);
            System.out.println("lower bound set... "+ result);
            newRange.setLowerBound(result);
        }

    
        public void promptForUpperBound(){
            Scanner scanner = new Scanner(System.in);
            // long newNumber = 234324L;
            boolean upperBoundAcceptable = false;
            long result = 0;
    
                do {
                    System.out.println("What is the upper Bound?:");
                    String upperBound = scanner.nextLine();
                    
                    try {
                        result = Long.parseLong(upperBound);
                        upperBoundAcceptable = true;
                    } catch(IllegalArgumentException iae) {
                        System.out.printf("%s. You idiot. That is not a number. %n",
                                        iae.getMessage());
                    }
            } while(!upperBoundAcceptable);
                System.out.println("upper bound set... "+ result);
                newRange.setUpperBound(result);
            }



        


}