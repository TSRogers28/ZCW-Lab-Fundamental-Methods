

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StringUtilitiesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StringUtilitiesTest {
    private StringUtilities stringUtilities;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        stringUtilities = new StringUtilities();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void getHelloWorldTest() {
        // : Given
        String expected = "Hello World";

        // : When
        String actual = stringUtilities.getHelloWorld();

        // : Then
        assertEquals(expected, actual);

    }

    @Test
    public void concatenationStringTest(){
        // : Given
        String one = "Hello";
        String two = " Java";
        String expected = "Hello Java";

        // : When
        String actual = stringUtilities.concatenation(one,two);


        // : Then
        assertEquals(expected, actual);
    }


    @Test
    public void concatenationStringAndIntegerTest(){
        // : Given
        int one = 1;
        String two = " Java";
        String expected = "1 Java";

        // : When
        String actual = stringUtilities.concatenation(one,two);


        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void substringBeginTest(){
        // : Given
        String input = "Hello";
        String expected = "Hel";

        // : When
        String actual = stringUtilities.getPrefix(input);

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void substringEndTest(){
        // : Given
        String input = "Hello";
        String expected = "llo";

        // : When
        String actual = stringUtilities.getSuffix("Hello");

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void compareToTestEquals(){
        // : Given
        String inputValue = "Zipcode";
        String comparableValue = "Zipcode";

        // : When
        boolean actual = stringUtilities.compareTwoStrings(inputValue, comparableValue);

        // : Then
        assertTrue(actual);
    }


    @Test
    public void compareToTestNotEquals(){
        // : Given
        String inputValue = "Zipcode";
        String comparableValue = "Zipcodee";

        // : When
        boolean actual = stringUtilities.compareTwoStrings(inputValue, comparableValue);

        // : Then
        assertFalse(actual);
    }

    @Test
    public void getTheMiddleChar1(){
        // : Given
        String input = "Zipcode";
        Character expected = 'c';

        // : When
        Character actual = stringUtilities.getMiddleCharacter(input);

        // : Then
        assertEquals(expected.toString(), actual.toString());
    }


    @Test
    public void getTheMiddleChar2(){
        // : Given
        String input = "Zipcoder";
        Character expected = 'c';

        // : When
        Character actual = stringUtilities.getMiddleCharacter(input);

        // : Then
        assertEquals(expected.toString(), actual.toString());
    }


    @Test
    public void getTheFirstWord(){
        // : Given
        String input = "Zipcode Wilmington";
        String expected = "Zipcode";

        // : When
        String actual = stringUtilities.getFirstWord(input);

        // : Then
        assertEquals(expected, actual);
    }


    @Test
    public void getTheSecondWord(){
        // : Given
        String input = "Zipcode Wilmington";
        String expected = "Wilmington";

        // : When
        String actual = stringUtilities.getSecondWord(input);

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void reverseThem(){
        // : Given
        String input = "Zipcode Wilmington";
        String expected = "notgnimliW edocpiZ";


        // : When
        String actual = stringUtilities.reverse(input);

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void removeWhitespace(){
        // : Given
        String input = "It's a beautiful day in this neighborhood";
        String expected = "It'sabeautifuldayinthisneighborhood";

        // : When
        String actual = stringUtilities.removeWhitespace(input);

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void trimWhitespaceInTheBegginningAndEnd(){
        // : Given
        String input = "    Zipcode Wilmington ";
        String expected = "Zipcode Wilmington";

        // : When
        String actual = stringUtilities.trim(input);

        // : Then
        assertEquals(expected, actual);
    }
}
