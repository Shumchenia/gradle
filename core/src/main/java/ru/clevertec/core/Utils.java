package ru.clevertec.core;

import util.StringUtils;

import java.util.List;
import java.util.stream.Stream;

public class Utils {
    public static List<Boolean> isAllPositivenumber(String... str) {
        return Stream.of(str)
                .map(StringUtils::isPositiveNumber)
                .toList();
    }
}
