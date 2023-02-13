package util;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (org.apache.commons.lang3.StringUtils.isNumeric(str))
            return 0 <= Integer.parseInt(str);
        return false;
    }

}
