package ru.netology;
import org.junit.Test;
import org.junit.Assert;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @Test
    public void shouldCalcRemainderIfPurchase500() {
        int actual = service.remain(500);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainderIfPurchase1500() {
        int actual = service.remain(1500);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainderIfPurchase1000() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainderIfPurchase0() {
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    
    @Test
    public void shouldCalcRemainderIfPurchase999() {
        int actual = service.remain(999);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldCalcRemainderIfPurchase1001() {
        int actual = service.remain(1001);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

}
