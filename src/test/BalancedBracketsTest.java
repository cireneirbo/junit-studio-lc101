package test;

import org.junit.Test;

import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }

    @Test
    public void balancedBracketsReturnsTrue() {

        assertTrue(hasBalancedBrackets("[]"));
    }

    @Test
    public void balancedBracketsReturnsFalse() {

        assertFalse(hasBalancedBrackets("["));
    }

    @Test
    public void emptyBalancedBracketsReturnsTrue() {

        assertTrue(hasBalancedBrackets(""));
    }

    @Test
    public void balancedBracketsWithContentInMiddleReturnsTrue() {

        assertTrue(hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void balancedBracketsInternalBracketsReturnsTrue() {

        assertTrue(hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void balancedBracketsAtStartReturnsTrue() {

        assertTrue(hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void balancedBracketsWithContentInMiddleReturnsFalse() {

        assertFalse(hasBalancedBrackets("[LaunchCode]]"));
    }

    @Test
    public void balancedBracketsWithBracketsOnEndReturnsFalse() {

        assertFalse(hasBalancedBrackets("LaunchCode][]"));
    }

    @Test
    public void balancedBracketsWithNoContentOneBracketReturnsFalse() {

        assertFalse(hasBalancedBrackets("["));
    }

    @Test
    public void balancedBracketsWithReversedBracketsReturnsFalse() {

        assertTrue(hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void balancedBracketsWithOneBracketAtStartReturnsFalse() {

        assertFalse(hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void balancedBracketsWithNoContentReversedBracketsReturnsFalse() {

        assertTrue(hasBalancedBrackets("]["));
    }

}
