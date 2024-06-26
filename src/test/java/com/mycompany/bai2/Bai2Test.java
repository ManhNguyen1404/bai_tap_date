package com.mycompany.bai2;

import org.junit.Test;
import static org.junit.Assert.*;

public class Bai2Test {

    @Test
    public void testNextDate() {
        assertEquals("1/1/2012", Bai2.NextDate(31, 12, 2011));
        assertEquals("1/3/2012", Bai2.NextDate(29, 2, 2012));
        assertEquals("2/12/2012", Bai2.NextDate(1, 12, 2012));
        assertEquals("Ngày không hợp lệ", Bai2.NextDate(32, 1, 2012));
    }

    @Test
    public void testLeapYear() {
        assertTrue(Bai2.isLeapYear(2000));
        assertTrue(Bai2.isLeapYear(2012));
        assertFalse(Bai2.isLeapYear(1900));
        assertFalse(Bai2.isLeapYear(2011));
    }
}
