import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByOne {

    static CharacterComparator offByOne = new OffByOne();
    @Test
    public void test1(){
        assertTrue(offByOne.equalChars('a','b'));
    }
    @Test
    public void test2(){
        assertTrue(offByOne.equalChars('b','a'));
    }
    @Test
    public void test3(){
        assertFalse(offByOne.equalChars('a','c'));
    }
    @Test
    public void test4(){
        assertFalse(offByOne.equalChars('c','a'));
    }
}
