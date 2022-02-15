package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void amountEqualBoundary() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void amountLessBoundary() {
        int actual = service.remain(600);
        int expected = 400;
        assertEquals(expected, actual);
    }

    @Test
    public void amountMoreBoundary() {
        int actual = service.remain(2500);
        int expected = 500;
        assertEquals(expected, actual);
    }
}