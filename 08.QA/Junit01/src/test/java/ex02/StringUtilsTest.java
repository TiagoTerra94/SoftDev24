package ex02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    void isPalindromeTest(){
        assertFalse(StringUtils.isPalindrome(null));
    }

    @Test
    void isPalindromeUppercase(){
        assertTrue(StringUtils.isPalindrome("RACECAR"));
        assertTrue(StringUtils.isPalindrome("OVO"));
        assertTrue(StringUtils.isPalindrome("WEREW"));
        assertFalse(StringUtils.isPalindrome("TIAGO"));
    }

    @Test
    void isPalidromeLowercase(){
        assertTrue(StringUtils.isPalindrome("ovo"));
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertFalse(StringUtils.isPalindrome("TIAGO"));
    }

    @Test
    void isPalindromeEmpty(){
        assertFalse(StringUtils.isPalindrome(""));
    }

    @Test
    void isPalidromeSpecialChars(){
        assertFalse(StringUtils.isPalindrome("T%.P"));
        assertFalse(StringUtils.isPalindrome("tiago"));
    }
}
