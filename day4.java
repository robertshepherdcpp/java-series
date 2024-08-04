/*
Write a program that creates an array of the first 10 natural numbers and then creates another array containing the squares of these numbers. Print both arrays.*/
int[] arr = new int[10];
int[] square = new int[10];
for(int i = 0; i < 10; i++)
{
    arr[i] = i;
    square[i] = i * i;
}

for(int i : arr) {System.out.println(i);}
for(int i : square) {System.out.println(i);}

/*
Write a program that finds the maximum element in an array of integers.
*/
int[] integers = {1, 5, 8, 3, 1, 2};
int max_element = integers[0];
for(int i : integers)
{
    if(i > max_element)
    {
        max_element = i;
    }
}
System.out.println(max_element);

/*
Write a program that reverses an array of integers.
*/
int[] reversed = new int[6];
for(int i = integers.length - 1; i > 0; i--)
{
    reversed[5 - i] = integers[i];
}

/*
Write a program that computes the transpose of a given 3x3 matrix.
*/
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

int[][] copy = matrix;

for(int i = 0; i < matrix.length; i++)
{
    for(int j = 0; j < matrix[0].length; i++)
    {
        matrix[i][j] = copy[j][i];
    }
}
for(int x : matrix)
{
    for(int y : matrix)
    {
        System.out.print(x);
        System.out.print(" ");
    }
    System.out.println();
}

/*
Write a program that calculates the sum of the diagonal elements of a given 3x3 matrix.
*/
