/*
        Declare an array of integers to store the ages of 10 people. Initialize the array with sample ages and write a program to find the average age.
        */
        int[] ages = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for(int i = 0; i < ages.length; i++)
        {
            count += ages[i];
        }
        System.out.println(count / ages.length);
        
        /*
        Write a program to find the maximum and minimum values in an array of integers.
        */
        int[] integers = {3245,4,6, 456, 58,1243,76};
        Arrays.sort(integers);
        System.out.println("The smallest: " + integers[0]);
        System.out.println("The largest: " + integers[integers.length - 1]);
        
        /*Create a 2D array to represent a 3x3 matrix. Write a program to calculate the sum of all elements in the matrix.*/
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
