import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    @Test
    public void testPalindromeTrue(){
        Palindrome temp = new Palindrome();
        assertTrue(temp.isPalindrome("aca"));
        assertTrue(temp.isPalindrome("c"));
        assertTrue(temp.isPalindrome(""));

    }
    @Test
    public void testPalindromeFalse(){
        Palindrome temp = new Palindrome();
        assertFalse(temp.isPalindrome("abc"));
    }
    @Test
    public  void testOffByOne(){
        Palindrome temp = new Palindrome();
        CharacterComparator cc = new OffByOne();
        assertTrue(temp.isPalindrome("flake",cc));
        assertFalse(temp.isPalindrome("aba",cc));
    }
}
