package prog.prak;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    @Test
    public void reverseTest0() {
        String msg = "";
        assertEquals( "", Strings.reverse(msg));
    }
    @Test
    public void reverseTesta() {
        String msg = "a";
        assertEquals( "a", Strings.reverse(msg));
    }
    @Test
    public void reverseTestProgrammierung() {
        String msg = "Programmierung";
        assertEquals( "gnureimmargorP", Strings.reverse(msg));
    }

    @Test
    public void isPalindromeEmpty() {
        assertTrue(Strings.isPalindrome(""));
    }
    @Test
    public void isPalindromeOne() {
        assertTrue(Strings.isPalindrome("x"));
    }
    @Test
    public void isPalindromeRegal() {
        assertTrue(Strings.isPalindrome("regallager"));
    }
    @Test
    public void isPalindromeRelief() {
        assertTrue(Strings.isPalindrome("reliefpfeiler"));
    }
    @Test
    public void isPalindromeRentner() {
        assertTrue(Strings.isPalindrome("rentner"));
    }
    @Test
    public void isPalindromeErika() {
        assertTrue(Strings.isPalindrome("erikafeuertnuruntreuefakire"));
    }
    @Test
    public void isPalindromeFalse() {
        assertFalse(Strings.isPalindrome("Programmierung"));
    }

    @Test
    public void parseLongTestAf(){
        assertEquals(175, Strings.parseLong("Af", 16));
    }

    @Test
    public void reverse2Test(){
        String msg = "erikafeuertnuruntreuefakire";
        assertEquals("erikafeuertnuruntreuefakire", Strings.reverse2(msg));
    }
}