package MaximumAndMinimumOfAnArray.Question;

public class MiddleOfThree {
    
    static int middle( int a, int b, int c ) {
        if ( a < b ) {
            return ( b < c ) ? b : Math.max(a, c);
        }

        return ( a < c ) ? a : Math.max(b, c);
    }

    public static void main( String[] args ) {
        System.out.println(middle( 100, 10, 5 ));
    }

}
