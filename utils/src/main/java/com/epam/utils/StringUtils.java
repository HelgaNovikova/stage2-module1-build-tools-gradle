package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if ((str.trim().length()==0) || (str.equals("null"))){
            return false;
        }
        return NumberUtils.createDouble(str)>0;
    }
}
