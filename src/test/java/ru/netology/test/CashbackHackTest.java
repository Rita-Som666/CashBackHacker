package ru.netology.test;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;
import org.testng.Assert;

public class CashbackHackTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void test(){

      int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected );

    }


}
