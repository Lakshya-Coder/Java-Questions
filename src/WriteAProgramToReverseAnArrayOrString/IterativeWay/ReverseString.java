package WriteAProgramToReverseAnArrayOrString.IterativeWay;

import java.util.Scanner;

public class ReverseString {

    static String reverseString( String string, int start, int end ) {
        String reverseString = "";

        int index = end - 1;

        while ( index >= start ) {
            reverseString += string.charAt(index);   
            index--;
        }

        return reverseString;
    }

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );

        String string = sc.nextLine();

        sc.close();

        String reverseString = reverseString( string, 0, string.length() );

        System.out.println(reverseString);
    }
    
}
