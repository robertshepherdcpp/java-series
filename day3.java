class hello {
    public static void main(String[] args)
    {
        /*
Temperature Check Program:
Write a program that takes a temperature value as input and prints whether it's "Hot", "Warm", or "Cold". Use if-else statements.
*/
int input = 56;
if(input <= 30)
{
    System.out.println("Cold");
}
else if(input <= 50)
{
    System.out.println("Warm");
}
else {
    System.out.println("Hot");
}
/*
Write a program that takes an integer as input and checks if it is odd or even using a conditional statement. Print the result.
*/
int input2 = 45;
if(input2 % 2 == 0)
{
    System.out.println("Even");
}
else {
    System.out.println("Odd");
}

/*
Write a program that takes two numbers and an operator (+, -, *, /) as input and performs the corresponding arithmetic operation using a switch statement.
*/

char input3 = '+';
int a = 9;
int b = 15;
switch(input3)
{
    case '+':
        System.out.println(a + b);
        break;
    case '-': 
        System.out.println(a - b);
        break;
    default:
        System.out.println(a * b);
}
/*
Write a program that prints the multiplication table of a given number using a for loop.
*/
for(int i = 1; i < 12; i++)
{
    for(int j = 1; j < 12; j++)
    {
        System.out.print(i * j);
        System.out.print(" ");
    }
    System.out.print("\n");
}
/*
write a program to calculate the sum of the first n natural numbers using a while loop.*/
int n = 10;
int count = 0;
while(n > 0)
{
    count += n;
    n--;
}
System.out.print(count);
}
}
