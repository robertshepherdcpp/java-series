import java.util.Arrays;


public class Strings {

/*
Write a Java program to count the number of vowels in a given string.
*/
public static int countChars(String s)
{
    return s.length();
}

/*
Create a program that checks if a given string is a palindrome.
*/
public static boolean isPalindrome(String original)
{
    StringBuilder sb = new StringBuilder(original);
        sb.reverse();
        
        String reversed = sb.toString();
    return original == reversed;
}

/*
Create a method that takes a sentence and returns the longest word in it.
*/
public static String longestWord(String sentance)
{
    String longest_word = new String();
    int last_index = 0;
    for(int i = 0; i < sentance.length(); i++)
    {
        if(sentance.charAt(i) == ' ')
        {
            String word = sentance.substring(last_index, i);
            last_index = i + 1;
            if(word.length() > longest_word.length())
            {
                longest_word = word;
            }
        }
    }
    return longest_word;
}

public static void main(String[] args) {

        
    }
}
