/*
instead of doing: 
public static <T> void printList(List<T> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
you can do this:
public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
*/

/*
Create a Generic Class Pair: Create a generic class Pair that can hold two related objects of any type (e.g., name-value pairs). Write methods to set and get the values and demonstrate this with a main method.

Implement a Generic Method to Swap Elements in an Array: Write a generic method that takes an array and two indices, and swaps the elements at these indices. Test this method with arrays of different types.

Create a Bounded Generic Class Range: Create a generic class Range<T extends Number> that holds a range of numbers (min and max). Add methods to check if a number is within the range and demonstrate this with different types of numbers (e.g., Integer, Double).
*/

class Range<T extends Number>
{
    public Range(Number[] n) {this.numbers = numbers;}
    
    Number[] numbers;
    
    // public static Number min()
    // {
    //     Number lowest = numbers[0];
    //     for (Integer i = 0; i < numbers.size(); i++)
    //     {
    //         if(numbers[i] < lowest)
    //         {
    //             lowest = numbers[i];
    //         }
    //     }
    //     return lowest;
    // }
    
    // public static Number min()
    // {
    //     Number highest = numbers[0];
    //     for (Integer i = 0; i < numbers.size(); i++)
    //     {
    //         if(numbers[i] > lowest)
    //         {
    //             lowest = numbers[i];
    //         }
    //     }
    //     return highest;
    // }
}

class Pair<K, V> {
    K m_k;
    V m_v;

    public Pair(K k, V v) {
        this.m_k = k;
        this.m_v = v;
    }

    void set(V v) {
        m_v = v;
    }

    V get() {
        return m_v;
    }
}

public class Main {
    public static <T> void swap(T[] arr, Integer i, Integer j)
    {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("One", 1);
        System.out.println("Key: " + pair.m_k + ", Value: " + pair.get());
        
        pair.set(2);
        System.out.println("Updated Value: " + pair.get());
    }
}
