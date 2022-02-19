package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void amountEqualBoundary() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void amountLessBoundary() {
        int actual = service.remain(600);
        int expected = 400;
        assertEquals(actual, expected);
    }

    @Test
    public void amountMoreBoundary() {
        int actual = service.remain(2500);
        int expected = 500;
        assertEquals(actual, expected);
    }
}