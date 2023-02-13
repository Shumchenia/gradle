package ru.clevertec.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    void isPositive(){
        String str="7";
        Assertions.assertTrue(StringUtils.isPositiveNumber(str));
    }
    @Test
    void isNegative(){
        String str="-7";
        assertFalse(StringUtils.isPositiveNumber(str));
    }
    @Test
    void isNull(){
        String str="0";
        assertTrue(StringUtils.isPositiveNumber(str));
    }
}
