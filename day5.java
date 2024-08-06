public class MainProgram {
    public static void main(String[] args) {
        MainProgram m = new MainProgram();
        System.out.println(m.factorial(5));
        System.out.println(m.isPrime(13));
    }
    
    /*
        Write a method calculateSimpleInterest that takes the principal, rate of interest, and time as parameters and returns the simple interest calculated using the formula: SI = (Principal * Rate * Time) / 100.
        */
    public double calculateSimpleInterest(double principal, double rate_of_interest, double time)
    {
        return (principal * rate_of_interest * time) / 100;
    }
    
    /*
    Write overloaded methods calculateArea to compute the area of different shapes:
calculateArea(int side) - computes the area of a square.
calculateArea(int length, int breadth) - computes the area of a rectangle.
calculateArea(double radius) - computes the area of a circle.
    */
    public int calculateArea(int side) {return side * side;}
    public int calculateArea(int length, int breadth) {return length * breadth;}
    public double calculateArea(double radius) {return PI * (radius * radius);}
    double PI = 3.14159265358979323;
    
    /*
    Write a method isPalindrome that takes a string as a parameter and returns true if the string is a palindrome and false otherwise.
    */
    public boolean isPalindrome(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reversedString = sb.toString();
        if(s == reversedString)
        {
            return true;
        }
        else {
            return false;
        }
    }
    
    /*
    Write a method calculateFactorial that takes an integer as a parameter and returns the factorial of that integer.
    */
    public int factorial(int x)
    {
        if(x <= 1)
        {
            return x;
        }
        else {
            return x * factorial(x - 1);
        }
    }
    
    /*
    Write a method isPrime that takes an integer as a parameter and returns true if the number is prime and false otherwise.
    */
    public boolean isPrime(int x)
    {
        for(int i = x; i >= 1; i--)
        {
            if(x % i == 0 && i != x && i != 1)
            {
                return false;
            }
        }
        return true;
    }
}
