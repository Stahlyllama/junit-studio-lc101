package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTestReturnsTrue() {
            }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void twoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void threeBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"));
    }
    @Test
    public void fourBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][[]]"));
    }
    @Test
    public void fiveBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[][][]]]"));
    }
    @Test
    public void sixBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[[]]]]]]"));
    }
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
git     public void pizzaInsideBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[pizza]"));
    }
    @Test
    public void onlyOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyClosedBracketsReturnsFalse(){
            assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void misMatchedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void misMatchedPizzaBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[pizza[]"));
    }
}
