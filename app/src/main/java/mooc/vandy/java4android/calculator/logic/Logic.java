package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here
        if(operation==1){
            mOut.print(Integer.toString(Add.result(argumentOne,argumentTwo)));
        }else if(operation ==2){
            mOut.print(Integer.toString(Subtract.result(argumentOne,argumentTwo)));
        }else if(operation ==3){
            mOut.print(Integer.toString(Multiply.result(argumentOne,argumentTwo)));
        }else {
            mOut.print(Divide.result(argumentOne,argumentTwo));
        }
    }
}
