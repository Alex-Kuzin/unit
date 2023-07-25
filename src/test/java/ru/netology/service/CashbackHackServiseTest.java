package ru.netology.service;
import org.junit.Test;
import org.junit.Assert;

public class CashbackHackService {
    @Test
    public void shouldCalculateCashbackAtZeroPurchaseValue() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 0;
        assertEguals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackPositivePurchaseValue() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackNegativePurchaseValue() {
        CashbackHackService service = new CashbackHackService();
        int amount = -1000;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }
}