// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;

/*
Create a custom exception called InsufficientFundsException for a banking application. This exception should be thrown when a user tries to withdraw more money than their balance.
*/

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Error: Method defined outside any class
public class BankOperations {
    
    public static void withdrawFunds(int amount) throws InsufficientFundsException {
        if (amount > 50) {
            throw new InsufficientFundsException("Insufficient funds to withdraw " + amount);
        }
    }

/*
Write a program that attempts to divide two numbers and catches any ArithmeticException that occurs. If an exception is caught, print a message indicating that division by zero is not allowed.
*/

public static void divNums(int a, int b)
{
    try {
        int result = a / b;
    }
    catch(ArithmeticException y)
    {
        System.out.println("Division by 0 is not allowed.");
    }
}

public static void inBounds(int[] arr)
{
    try {
        arr[1000] = 5;
    }
    catch(ArrayIndexOutOfBoundsException x)
    {
        System.out.println("The array is not large enough for this function.");
    }
}

public static void main(String[] args) {
        /*
        Write a program that initializes an array of integers with some values and attempts to access an index that is out of bounds. Catch the ArrayIndexOutOfBoundsException and print a message indicating that the index is invalid.
        */
        // BankOperations b = new BankOperations();
        
        inBounds(new int[]{4, 6, 8});
        divNums(5, 0);
        try{
        withdrawFunds(100);
        } catch(InsufficientFundsException e)
        {
            System.out.println("Hi");
        }
        finally {
            System.out.println("This will always work");
        }
        
    }
}
