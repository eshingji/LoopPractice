import java.util.Scanner;
public class Problem1 {
    private Scanner keyboardReader;
    private int numStars;

    public Problem1()
    {
     keyboardReader = new Scanner(System.in);
    }
    public void run()
    {
        System.out.println("Pick a number ");
        numStars = keyboardReader.nextInt();
        
    }
}
