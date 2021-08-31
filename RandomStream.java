import java.util.Scanner;

/**
* An implementation of a solution to the problem of sampling random inputs from a
* stream of unknown length.
*
* @author your-name-here
*/
public class RandomStream {
    
    private static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println(randomLine());
		
	}
	
    /**
    * Helper method to get the next line of a stream. Remember that once you advance
    * to the next line of the stream, you cannot return to a previous line!
    *
    * @return the next line of the input stream from StdIn. An empty string "" is
    * returned if the end of the input is reached.
	*/
	public static String next() {
		if (s.hasNext())
            return s.next();
        return "";
	}
    
    /**
    * Helper method to generate a uniformly random number in the interval (0,1).
    *
    * @return a random double between 0 and 1 (exclusive).
    */
    public static double random() {
        
        return Math.random();
    } 
    
    /**
    * Chooses a line from an input stream uniformly at random.
    * @return uniformly random line from StdIn.
    */
    public static String randomLine() {
        
        //TODO: Fill in method body.
    }
	
}
