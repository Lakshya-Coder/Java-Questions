package WriteAProgramToReverseAnArrayOrString.RecursiveWay;

import java.util.Scanner;

public class ReverseString {
    
    static String reverseString(String string, int start, int end) {
        if ( end < start ) return null;

        int index = end;
        String reverse_String = "";

        reverse_String += string.charAt( index );
        reverse_String += reverseString( string, start, end - 1 );

        return slicing( reverse_String, 0, string.length() );
    }

    static String slicing( String string, int start, int end ) {
        String slicing = "";

        for ( int i = start; i < end; i++ ) {
            slicing += string.charAt(i);
        }

        return slicing;
    }

    public static void main( String[] args ) {
        
        Scanner sc = new Scanner( System.in );

        String string = sc.nextLine();

        sc.close();

        String reverseString = reverseString( string, 0, string.length() - 1 );

        System.out.println(reverseString);

    }

}
