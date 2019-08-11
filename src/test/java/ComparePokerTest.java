import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class ComparePokerTest {
    @Test
    public void should_return_4H_given_2C_4H_when_call_compare(){
        Poker a = new Poker("4", "H");
        Poker b = new Poker("2", "C");
        ComparePoker comparePoker = new ComparePoker();
        Poker c =  comparePoker.compare(a, b);
        Assert.assertEquals(c.getSize(), "4");
    }
}
