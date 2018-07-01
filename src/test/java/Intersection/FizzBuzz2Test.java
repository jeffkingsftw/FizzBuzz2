package Intersection;

import static Intersection.StringConstants.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzz2Test {

    /**
     * Tests to validate the isMultipleOfThree() method
     * For any number n should return true if
     * the number is a multiple of 3
     * Examples:
     *  3 => true
     *  -3 => true
     *  15 => true
     *  0 => false
     *  5 => false
     */
    @Test
    public void whenMultipleOfThree() {
        FizzBuzz2 fb1 = new FizzBuzz2( 0, 0 );
        boolean result = false;

        int num = -33;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = -30;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = -20;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = -15;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = -9;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = -5;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = -3;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = -1;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = 0;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = 1;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = 3;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = 5;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = 9;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = 15;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = 20;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = 30;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = 33;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );
    }

    /**
     * Tests to validate the isMultipleOfFive() method
     * For any number n should return true if
     * the number is a multiple of 5
     * Examples:
     *  5 => true
     *  -5 => true
     *  15 => true
     *  0 => false
     *  6 => false
     */
    @Test
    public void whenMultipleOfFive() {
        FizzBuzz2 fb1 = new FizzBuzz2( 0, 0 );
        boolean result = false;

        int num = -33;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = -30;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = -20;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = -15;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = -9;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = -5;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = -3;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = -1;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = 0;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = 1;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = 3;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = 5;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = 9;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = 15;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = 20;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = 30;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = 33;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );
    }

    /**
     * Tests to validate the isMultipleOfFifteen() method
     * For any number n should return true if
     * the number is a multiple of 15
     * Examples:
     *  15 => true
     *  -15 => true
     *  30 => true
     *  0 => false
     *  40 => false
     */
    @Test
    public void whenMultipleOfFifteen() {
        FizzBuzz2 fb1 = new FizzBuzz2( 0, 0 );
        boolean result = false;

        int num = -33;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = -30;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( true, result );

        num = -20;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = -15;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( true, result );

        num = -9;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = -5;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = -3;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = -1;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 0;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 1;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 3;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 5;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 9;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 15;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( true, result );

        num = 20;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 30;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( true, result );

        num = 33;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );
    }

    /**
     * Tests to validate the containsThree() method
     * For any number n should return true if
     * the number is contains 3
     * Examples:
     *  3 => true
     *  -3 => true
     *  13 => true
     *  0 => false
     *  6 => false
     */
    @Test
    public void whenContainsThree() {
        FizzBuzz2 fb1 = new FizzBuzz2( 0, 0 );
        boolean result = false;

        int num = -33;
        result = fb1.containsThree( num );
        assertEquals( true, result );

        num = -30;
        result = fb1.containsThree( num );
        assertEquals( true, result );

        num = -20;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = -15;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = -9;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = -5;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = -3;
        result = fb1.containsThree( num );
        assertEquals( true, result );

        num = -1;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = 0;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = 1;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = 3;
        result = fb1.containsThree( num );
        assertEquals( true, result );

        num = 5;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = 9;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = 15;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = 20;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = 30;
        result = fb1.containsThree( num );
        assertEquals( true, result );

        num = 33;
        result = fb1.containsThree( num );
        assertEquals( true, result );
    }

    /**
     * Tests to validate the getOutputList() method
     * with a list of a single value: n - n
     * Examples:
     *  ( 0, 0 ) => 0
     *  ( 3, 3 ) => lucky
     *  ( 5, 5 ) => buzz
     *  ( 6, 6 ) => fizz
     *  ( -15, -15 ) => fizzbuzz
     */
    @Test
    public void whenSingleNumberInList() {
        FizzBuzz2 fb1 = new FizzBuzz2( -1, -1 );
        String expectedResult = "-1";
        String actualResult = fb1.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz2 fb2 = new FizzBuzz2( 0, 0 );
        expectedResult = "0";
        actualResult = fb2.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz2 fb3 = new FizzBuzz2( 2, 2 );
        expectedResult = "2";
        actualResult = fb3.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz2 fb4 = new FizzBuzz2( 3, 3 );
        actualResult = fb4.getOutputList();
        assertEquals( CONTAINS_THREE_TEXT, actualResult );

        FizzBuzz2 fb5 = new FizzBuzz2( 5, 5 );
        actualResult = fb5.getOutputList();
        assertEquals( MULTIPLE_OF_FIVE_TEXT, actualResult );

        FizzBuzz2 fb6 = new FizzBuzz2( 15, 15 );
        actualResult = fb6.getOutputList();
        assertEquals( MULTIPLE_OF_FIFTEEN_TEXT, actualResult );

        FizzBuzz2 fb7 = new FizzBuzz2( 6, 6 );
        actualResult = fb7.getOutputList();
        assertEquals( MULTIPLE_OF_THREE_TEXT, actualResult );
    }

    /**
     * Tests to validate the getStatistics() method reports accurate
     * statistics in the list
     * Example:
     *  (-3, 3) => lucky: 2 integer: 5
     */
    @Test
    public void whenRangeOfNumbers() {
        FizzBuzz2 allNegative = new FizzBuzz2( -1, -15 );
        allNegative.setOutputList();
        String expectedResult = MULTIPLE_OF_FIFTEEN_TEXT + " -14 " + CONTAINS_THREE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " -11 " + MULTIPLE_OF_FIVE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " -8 -7 " + MULTIPLE_OF_THREE_TEXT
                + " " + MULTIPLE_OF_FIVE_TEXT + " -4 " + CONTAINS_THREE_TEXT + " -2 -1";
        String actualResult = allNegative.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz2 allPositive = new FizzBuzz2( 1, 15 );
        allPositive.setOutputList();
        expectedResult = "1 2 " + CONTAINS_THREE_TEXT + " 4 " + MULTIPLE_OF_FIVE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " 7 8 " + MULTIPLE_OF_THREE_TEXT
                + " " + MULTIPLE_OF_FIVE_TEXT + " 11 " + MULTIPLE_OF_THREE_TEXT
                + " " + CONTAINS_THREE_TEXT + " 14 " + MULTIPLE_OF_FIFTEEN_TEXT;
        actualResult = allPositive.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz2 negativeToPositive = new FizzBuzz2( -15, 15 );
        negativeToPositive.setOutputList();
        expectedResult = MULTIPLE_OF_FIFTEEN_TEXT + " -14 " + CONTAINS_THREE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " -11 " + MULTIPLE_OF_FIVE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " -8 -7 " + MULTIPLE_OF_THREE_TEXT
                + " " + MULTIPLE_OF_FIVE_TEXT + " -4 " + CONTAINS_THREE_TEXT + " -2 -1 0 1 2 "
                + CONTAINS_THREE_TEXT + " 4 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT
                + " 7 8 " + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT + " 11 "
                + MULTIPLE_OF_THREE_TEXT + " " + CONTAINS_THREE_TEXT + " 14 " + MULTIPLE_OF_FIFTEEN_TEXT;
        actualResult = negativeToPositive.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz2 negativePositiveThirty = new FizzBuzz2( -33, 33 );
        negativePositiveThirty.setOutputList();
        expectedResult = CONTAINS_THREE_TEXT + " " + CONTAINS_THREE_TEXT + " " + CONTAINS_THREE_TEXT + " " + CONTAINS_THREE_TEXT
                + " -29 -28 " + MULTIPLE_OF_THREE_TEXT + " -26 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT
                + " " + CONTAINS_THREE_TEXT + " -22 " + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT
                + " -19 " + MULTIPLE_OF_THREE_TEXT + " -17 -16 " + MULTIPLE_OF_FIFTEEN_TEXT + " -14 " + CONTAINS_THREE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " -11 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT + " -8 -7 "
                + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT + " -4 " + CONTAINS_THREE_TEXT + " -2 -1 0"
                + " 1 2 " + CONTAINS_THREE_TEXT + " 4 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT + " 7 8 "
                + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT + " 11 " + MULTIPLE_OF_THREE_TEXT
                + " " + CONTAINS_THREE_TEXT + " 14 " + MULTIPLE_OF_FIFTEEN_TEXT + " 16 17 " + MULTIPLE_OF_THREE_TEXT
                + " 19 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT + " 22 " + CONTAINS_THREE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT + " 26 " + MULTIPLE_OF_THREE_TEXT
                + " 28 29 " + CONTAINS_THREE_TEXT + " " + CONTAINS_THREE_TEXT + " " + CONTAINS_THREE_TEXT + " " + CONTAINS_THREE_TEXT;
        actualResult = negativePositiveThirty.getOutputList();
        assertEquals( expectedResult, actualResult );
    }

    /**
     * Tests to validate the toString() method
     * which generates the String output of the list
     */
    @Test
    public void testToString() {
        FizzBuzz2 smallRange = new FizzBuzz2( -3, 3 );
        String expectedResult = CONTAINS_THREE_TEXT + " -2 -1 0 1 2 " + CONTAINS_THREE_TEXT;
        String actualResult = smallRange.toString();
        assertEquals( expectedResult, actualResult );

        FizzBuzz2 mediumRange = new FizzBuzz2( -5, 5 );
        expectedResult = MULTIPLE_OF_FIVE_TEXT + " -4 " + CONTAINS_THREE_TEXT + " -2 -1 0 1 2 "
                + CONTAINS_THREE_TEXT + " 4 " + MULTIPLE_OF_FIVE_TEXT;
        actualResult = mediumRange.toString();
        assertEquals( expectedResult, actualResult );

        FizzBuzz2 largeRange = new FizzBuzz2( -15, 15 );
        expectedResult = MULTIPLE_OF_FIFTEEN_TEXT + " -14 " + CONTAINS_THREE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " -11 " + MULTIPLE_OF_FIVE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " -8 -7 " + MULTIPLE_OF_THREE_TEXT
                + " " + MULTIPLE_OF_FIVE_TEXT + " -4 " + CONTAINS_THREE_TEXT + " -2 -1 0 1 2 "
                + CONTAINS_THREE_TEXT + " 4 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT
                + " 7 8 " + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT + " 11 "
                + MULTIPLE_OF_THREE_TEXT + " " + CONTAINS_THREE_TEXT + " 14 " + MULTIPLE_OF_FIFTEEN_TEXT;
        actualResult = largeRange.toString();
        assertEquals( expectedResult, actualResult );
    }
}
