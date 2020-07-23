package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    public static String result(int a,int b){

        int q=a/b;
        int r =a%b;
        return q+" R: "+r;
    }
}
