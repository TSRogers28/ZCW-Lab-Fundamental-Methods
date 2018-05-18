

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PredicateUtilitiesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PredicateUtilitiesTest
{
    private PredicateUtilities math;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        math = new PredicateUtilities();
    }

    @Test
    public void testGreaterThanTrue() {
        // : Given
        int greaterValue = 450;
        int lesserValue = 350;


        // : When
        boolean outcome = math.isGreaterThan(greaterValue, lesserValue);

        // : Then
        assertTrue(outcome);
    }


    @Test
    public void testGreaterThanFalse() {
        // : Given
        int greaterValue = 350;
        int lesserValue = 350;

        // : When
        boolean outcome = math.isGreaterThan(greaterValue, lesserValue);

        // : Then
        assertFalse(outcome);
    }


    @Test
    public void testLessThanTrue() {
        // : Given
        int greaterValue = 450;
        int lesserValue = 350;

        // : When
        boolean outcome = math.isLessThan(greaterValue, lesserValue);

        // : Then
        assertFalse(outcome);
    }


    @Test
    public void testLessThan1() {
        // : Given
        int greaterValue = 450;
        int lesserValue = 350;

        // : When
        boolean outcome = math.isLessThan(greaterValue, lesserValue);

        // : Then
        assertFalse(outcome);
    }


    @Test
    public void testLessOrEqual1() {
        // : Given
        int greaterValue = 3;
        int lesserValue = 3;

        // : When
        boolean outcome = math.isLessThanOrEqualTo(greaterValue, lesserValue);

        // : Then
        assertTrue(outcome);
    }

    @Test
    public void testLessOrEqual2() {
        // : Given
        int greaterValue = 3;
        int lesserValue = 6;

        // : When
        boolean outcome = math.isLessThanOrEqualTo(greaterValue, lesserValue);

        // : Then
        assertTrue(outcome);
    }

    @Test
    public void testGreaterOrEqual1() {
        // : Given
        int greaterValue = 4;
        int lesserValue = 4;

        // : When
        boolean outcome = math.isGreaterThanOrEqualTo(greaterValue, lesserValue);

        // : ThenP
        assertTrue(outcome);
    }


    @Test
    public void testGreaterOrEqual2() {
        // : Given
        int greaterValue = 8;
        int lesserValue = 15;

        // : When
        boolean outcome = math.isGreaterThanOrEqualTo(greaterValue, lesserValue);

        // : Then
        assertFalse(outcome);
    }
}
