import java.util.ArrayList;


public class NewRange {
    private long lowerBound;
    private long upperBound;
    
    public void setLowerBound(long lowerBound){
        this.lowerBound = lowerBound;
    }

    public void setUpperBound(long upperBound){
        this.upperBound = upperBound;
    }


    public ArrayList<Integer> checkForSquare( long num){
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        
        int intResult;
        for (long j = 1; j <= num ; j++){
             if (num % j == 0) {
                 intResult = (int) Math.pow(j, 2);
               divisors.add(intResult);
             }
        }
    
        int sum = 0;
        
        for (int i : divisors){
            System.out.print("i"+i);
            sum += i;
        }
        
        int sqrt = (int) Math.sqrt(sum);
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (Math.pow(sqrt,2) == sum) {
            result.add((int) num);
            result.add((int) sum);
            
            System.out.println("FOUND ONE"+result);
            System.out.println("Divisors"+divisors);
            return result;
        } else {
            System.out.println("NOPE");
            return result;
        }
        
      }
        
        public ArrayList<ArrayList<Integer>> listSquared() {
         
         ArrayList<ArrayList<Integer>> squares = new ArrayList<ArrayList<Integer>>();
         
         for (long i = this.lowerBound; i <= this.upperBound; i++){
            ArrayList<Integer> result = checkForSquare(i);
            if (result.isEmpty() == false) {
                System.out.println("NOT EMPTY"+result);
            
                squares.add(result);
            } else {
            }
         }
         
         
         return squares;
        }
    
}