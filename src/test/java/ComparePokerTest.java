import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
    @Test
    public void should_return_4C_5D_8H_9S_QC_when_given_4C_5D_8H_9S_QC_and_2C_3H_4C_8H_9D(){
         List<Poker> a = new ArrayList<>();
         a.add(new Poker("4", "C"));
         a.add(new Poker("5", "D"));
         a.add(new Poker("8", "H"));
         a.add(new Poker("9", "S"));
         a.add(new Poker("Q", "C"));
        List<Poker> b = new ArrayList<>();
        b.add(new Poker("2", "C"));
        b.add(new Poker("3", "H"));
        b.add(new Poker("4", "C"));
        b.add(new Poker("8", "H"));
        b.add(new Poker("9", "D"));
        ComparePoker comparePoker = new ComparePoker();
        List<Poker> c = comparePoker.compare(a, b);
        Assert.assertEquals(c.get(4).getSize(), "Q");
    }

    @Test
    public void should_return_2C_3H_4C_9H_9D_when_given_4C_5D_8H_9S_QC_and_2C_3H_4C_9H_9D(){
        List<Poker> a = new ArrayList<>();
        a.add(new Poker("4", "C"));
        a.add(new Poker("5", "D"));
        a.add(new Poker("8", "H"));
        a.add(new Poker("9", "S"));
        a.add(new Poker("Q", "C"));
        List<Poker> b = new ArrayList<>();
        b.add(new Poker("2", "C"));
        b.add(new Poker("3", "H"));
        b.add(new Poker("4", "C"));
        b.add(new Poker("9", "H"));
        b.add(new Poker("9", "D"));
        ComparePoker comparePoker = new ComparePoker();
        List<Poker> c = comparePoker.compare(a, b);
        Assert.assertEquals(c.get(4).getSize(), "9");
    }
}
