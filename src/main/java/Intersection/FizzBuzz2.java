package Intersection;

import static Intersection.StringConstants.*;

public class FizzBuzz2 {
    private int start = 0;
    private int end = 0;

    private String outputList = null;

    /**
     * Initializes the start and end values for the range of ints
     * The statistics map is indirectly created as an empty map
     * The output list needs to created by running setOutputList()
     * or getOutputList()
     * If the integers are out of order, the lowest value is used for start
     *
     * @param start - start value of the range
     * @param end - end value of the range
     */
    public FizzBuzz2( int start, int end ) {
        if( start <= end ) {
            this.start = start;
            this.end = end;
        } else {
            this.start = end;
            this.end = start;
        }
    }

    /**
     * Creates the output list for the object's range of integers
     * If the output list is already created, that list will be returned
     */
    public void setOutputList() {
        if( outputList != null ) {
            return;
        }

        StringBuilder sb = new StringBuilder();

        // order matters:
        // smaller numbers can have the same multiples as larger numbers
        // so evaluate larger multiples first
        for( int i = start; i <= end; i++ ) {
            if( containsThree( i ) ) {
                sb.append( CONTAINS_THREE_TEXT );
            } else if( isMultipleOfFifteen( i ) ) {
                sb.append( MULTIPLE_OF_FIFTEEN_TEXT );
            } else if( isMultipleOfFive( i ) ) {
                sb.append( MULTIPLE_OF_FIVE_TEXT );
            } else if( isMultipleOfThree( i ) ) {
                sb.append( MULTIPLE_OF_THREE_TEXT);
            } else {
                sb.append( i );
            }

            sb.append( " " );
        }

        this.outputList = sb.toString().trim();
    }

    /**
     * Gets the outputList list for the given range of integers
     * setOutputlist() will be called if the outputList has
     * not been initialized
     */
    public String getOutputList() {
        if( outputList == null ) {
            setOutputList();
        }

        return outputList;
    }

    /**
     * Checks if the given parameter is a multiple of three
     *
     * @param num - value to check
     * @return - true if the parameter is a multiple of three
     */
    public boolean isMultipleOfThree( int num ) {
        if( num == 0 ) {
            return false;
        }

        return num % 3 == 0;
    }

    /**
     * Checks if the given parameter is a multiple of five
     *
     * @param num - value to check
     * @return - true if the parameter is a multiple of five
     */
    public boolean isMultipleOfFive( int num ) {
        if( num == 0 ) {
            return false;
        }

        return num % 5 == 0;
    }

    /**
     * Checks if the given parameter is a multiple of fifteen
     *
     * @param num - value to check
     * @return - true if the parameter is a multiple of fifteen
     */
    public boolean isMultipleOfFifteen( int num ) {
        if( num == 0 ) {
            return false;
        }

        return num % 15 == 0;
    }

    /**
     * Checks if the given parameter contains a 3 digit
     *
     * @param num - value to check
     * @return - true if the parameter contains a 3, false otherwise
     */
    public boolean containsThree( int num ) {
        while( num != 0 ) {
            int mod = num % 10;
            if( mod == 3 || mod == -3 ) {
                return true;
            }

            num = num / 10;
        }

        return false;
    }

    /**
     * Returns the outputList
     *
     * @return
     */
    @Override
    public String toString() {
        return getOutputList();
    }
}
