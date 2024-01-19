package ru.netology.test;

import org.junit.Test;
import org.junit.Assert;
import ru.netology.service.CashbackHackService;

public class CashbackHackTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100under1000() {
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999more1000() {
        int actual = service.remain(1001);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1before1000() {
        int actual = service.remain(999);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999before1000() {
        int actual = service.remain(1);
        int expected = 999;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1more1000() {
        int actual = service.remain(1999);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0ifMore1000() {
        int actual = service.remain(2000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0if1000() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

}
