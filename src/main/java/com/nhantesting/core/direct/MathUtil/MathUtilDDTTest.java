package com.nhantesting.core.direct.MathUtil;


public class MathUtilDDTTest {
    public static long getAdd(int a, int b) {
        if (a < 0 || b < 0) throw new IllegalArgumentException("a and b must be more than 0...");
        else 
            return a + b;
    }
    

}
