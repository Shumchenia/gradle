package ru.clevertec;

import ru.clevertec.util.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.isPositiveNumber("2"));
        System.out.println(StringUtils.isPositiveNumber("-2"));
        System.out.println(StringUtils.isPositiveNumber("0"));
    }
}
