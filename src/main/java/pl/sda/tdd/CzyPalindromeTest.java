package pl.sda.tdd;
//import org.junit.Test;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pl.sda.tdd.czyPalindrom.istPalindrom;

public class CzyPalindromeTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public void checkifPalindrome1() {
        String wort = "reer";
        char[] warray = wort.toCharArray();
        boolean test = istPalindrom(warray);
        assertTrue(test);
    }

    @Test
    public void checkifPalindrome2() {
        String wort = "rekier";
        char[] warray = wort.toCharArray();
        boolean test2 = istPalindrom(warray);
        assertFalse(test2);

    }
    @Test
    public  void  checkifPalindrome3(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("podano zle dane");
    }
}