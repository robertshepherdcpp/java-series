// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        
        /* first assignment*/
        char c = 'c';
        int i = 10;
        long l = 10000;
        
        System.out.println(c);
        System.out.println(i);
        System.out.println(l);
        
        /* second assignment*/
        
        int x = 6;
        double y = x; // implicit cast
        
        char v = 'a';
        int b = (int) v;
        System.out.println(b);
        
        /*third assigment*/
        
        int num1 = 5;
        int num2 = 10;
        char opp = '+';
        
        System.out.println(num1 * num2);
        
        /*fourth assignment*/
        
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = false;
        
        System.out.println(!bool1 && bool2 || bool3);
    }
}
