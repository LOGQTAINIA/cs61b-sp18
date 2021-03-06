import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByOne {
    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.
    static CharacterComparator offByOne = new OffByOne();

    // Your tests go here.
    @Test
    public void testOffByOne() {
        assertFalse(offByOne.equalChars('a', 'a'));
        assertFalse(offByOne.equalChars('A', 'a'));
        assertTrue(offByOne.equalChars('A', 'B'));
        assertTrue(offByOne.equalChars('C', 'B'));
        assertFalse(offByOne.equalChars('C', 'd'));
        assertTrue(offByOne.equalChars('1', '0'));
        assertTrue(offByOne.equalChars('4', '5'));
        assertFalse(offByOne.equalChars('0', '9'));
        for (int i = 32; i < 127; i++) {
            assertTrue(offByOne.equalChars((char) i, (char) (i + 1)));
            assertFalse(offByOne.equalChars((char) i, (char) (i + 2)));
        }
    }
}
