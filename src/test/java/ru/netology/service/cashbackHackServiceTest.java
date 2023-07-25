package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class cashbackHackServiceTest {
    @Test
    void shouldCalculateCashbackAtZeroPurchaseValue() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals (actual, expected);
    }
    @Test
    void shouldCalculateCashbackPositivePurchaseValue() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals (actual, expected);
    }
    @Test
    void shouldCalculateCashbackNegativePurchaseValue() {
        CashbackHackService service = new CashbackHackService();
        int amount = -1000;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals (actual, expected);
    }
    @Test
    void shouldCalculateCashbackPurchaseValue() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals (actual, expected);
    }
}
