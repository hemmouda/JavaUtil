package com.hemmouda.java_util.utils;

/**
 * String utils
 */
public class Strings {

    /**
     * @return the capitalized version of <code>s</code>. Or
     * <code>null</code> if <code>s</code> is <code>null</code>.
     */
    public static String capitalize (String s) {
        if (s == null) {
            return null;
        } else if (s.isEmpty()) {
            return s;
        }

        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

}
